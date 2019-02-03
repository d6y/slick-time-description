object Dump extends App {

  import java.time._
  import shapeless._

  //For each of these profiles...
  val profiles =
    slick.jdbc.DB2Profile ::
    slick.jdbc.DerbyProfile ::
    slick.jdbc.H2Profile ::
    slick.jdbc.HsqldbProfile ::
    slick.jdbc.SQLServerProfile ::
    slick.jdbc.MySQLProfile ::
    slick.jdbc.OracleProfile ::
    slick.jdbc.PostgresProfile ::
    slick.jdbc.SQLiteProfile ::
    Nil

  // ...I want to see the SQL Type and example SQL literal
  // for each of these java.time types:
  val examples = 
    Instant.now() :: 
    LocalDate.now() ::
    LocalTime.now() ::
    LocalDateTime.now() ::
    OffsetTime.now() ::
    OffsetDateTime.now() ::
    ZonedDateTime.now() ::
    HNil

  // To do that, I'll describe each example:
  case class Description(
    javaTypeName: String,
    sqlTypeName: String,
     sqlExampleLiteral: String
   )

  // For a type T, providing there's a JdbcType for it,
  // we can describe it by calling a couple of methods that
  // Slick provides:
  import slick.jdbc.JdbcType
  def describe[T: JdbcType](exampleJvmValue: T): Description = {
    val timeType = implicitly[JdbcType[T]]
    Description(
      exampleJvmValue.getClass().getName(),
      timeType.sqlTypeName(None),
      timeType.valueToSQLLiteral(exampleJvmValue),
    )
  }

  // Because we want to map over an HList (to keep the types
  // of each example), we lift `describe` to a poly function:
  object polyDescribe extends Poly1 {
    implicit def default[T: JdbcType] = at[T](t => describe(t))
  }

  // E.g., the class slick.jdbc.PostgresProfile$ -> "PostgresProfile"
  case class DbName(value: String)
  def dbName(profile: slick.jdbc.JdbcProfile): DbName  =
    DbName(profile.getClass().getName().init)

  // Generate the descriptions:
  val descriptions: Seq[(DbName, Seq[Description])] =
    for (profile <- profiles) yield {
      import profile.api._
      val name = dbName(profile)
      val timeDescriptions = examples.map(polyDescribe)
      (name -> timeDescriptions.toList)
  }

  // Output as markdown:
  println(asMarkdown(descriptions))

  def asMarkdown(row: Description): String =
    s"| `${row.javaTypeName}` | `${row.sqlTypeName}` | `${row.sqlExampleLiteral}` |"

  def asMarkdown(dbDescriptions: Seq[(DbName, Seq[Description])]): String = {
    dbDescriptions.map{ case (name, ds) =>
      s"""## `${name.value}`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
${ds.map(asMarkdown).mkString("\n")}
      
      """
  }.mkString("\n")
  }
}
