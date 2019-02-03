object Dump extends App {

  case class Description(javaTypeName: String, sqlTypeName: String, sqlExampleLiteral: String)

  import slick.jdbc.JdbcType
  def describe[T : JdbcType](exampleJvmValue: T): Description = {
      val timeType = implicitly[JdbcType[T]]
      Description(
        exampleJvmValue.getClass().getName(),
        timeType.sqlTypeName(None),
        timeType.valueToSQLLiteral(exampleJvmValue),
      )
  }

  import java.time.Instant
  val example: Instant = Instant.now()

  val profiles =
    slick.jdbc.PostgresProfile ::
    slick.jdbc.DerbyProfile ::
    Nil

  for (profile <- profiles) {
      println(profile.getClass().getName().init)
      import profile.api._
      val description = describe(example)
      println(description)
    }

}
