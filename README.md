# Enumerate the Slick date/time formats for java.time

# Example output

## `slick.jdbc.DB2Profile`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
| `java.time.Instant` | `VARCHAR(254)` | `'2019-02-03T18:20:28.660Z'` |
| `java.time.LocalDate` | `DATE` | `'2019-02-03'` |
| `java.time.LocalTime` | `VARCHAR(254)` | `'18:20:28.661'` |
| `java.time.LocalDateTime` | `TIMESTAMP` | `'2019-02-03 18:20:28.661'` |
| `java.time.OffsetTime` | `VARCHAR(254)` | `'18:20:28.661Z'` |
| `java.time.OffsetDateTime` | `VARCHAR(254)` | `'2019-02-03T18:20:28.661Z'` |
| `java.time.ZonedDateTime` | `VARCHAR(254)` | `'2019-02-03T18:20:28.661Z[Europe/London]'` |


## `slick.jdbc.DerbyProfile`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
| `java.time.Instant` | `VARCHAR(254)` | `'2019-02-03T18:20:28.660Z'` |
| `java.time.LocalDate` | `DATE` | `'2019-02-03'` |
| `java.time.LocalTime` | `VARCHAR(254)` | `'18:20:28.661'` |
| `java.time.LocalDateTime` | `TIMESTAMP` | `'2019-02-03 18:20:28.661'` |
| `java.time.OffsetTime` | `VARCHAR(254)` | `'18:20:28.661Z'` |
| `java.time.OffsetDateTime` | `VARCHAR(254)` | `'2019-02-03T18:20:28.661Z'` |
| `java.time.ZonedDateTime` | `VARCHAR(254)` | `'2019-02-03T18:20:28.661Z[Europe/London]'` |


## `slick.jdbc.H2Profile`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
| `java.time.Instant` | `TIMESTAMP(9) WITH TIME ZONE` | `'2019-02-03T18:20:28.660Z'` |
| `java.time.LocalDate` | `DATE` | `'2019-02-03'` |
| `java.time.LocalTime` | `VARCHAR` | `'18:20:28.661'` |
| `java.time.LocalDateTime` | `TIMESTAMP` | `'2019-02-03 18:20:28.661'` |
| `java.time.OffsetTime` | `VARCHAR` | `'18:20:28.661Z'` |
| `java.time.OffsetDateTime` | `VARCHAR` | `'2019-02-03T18:20:28.661Z'` |
| `java.time.ZonedDateTime` | `VARCHAR` | `'2019-02-03T18:20:28.661Z[Europe/London]'` |


## `slick.jdbc.HsqldbProfile`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
| `java.time.Instant` | `TIMESTAMP(9) WITH TIME ZONE` | `'2019-02-03 18:20:28.66'` |
| `java.time.LocalDate` | `DATE` | `'2019-02-03'` |
| `java.time.LocalTime` | `TIME(3)` | `'18:20:28.661'` |
| `java.time.LocalDateTime` | `TIMESTAMP` | `'2019-02-03 18:20:28.661'` |
| `java.time.OffsetTime` | `TIME(9) WITH TIME ZONE` | `'18:20:28.661+0:00'` |
| `java.time.OffsetDateTime` | `TIMESTAMP(9) WITH TIME ZONE` | `'2019-02-03 18:20:28.661+0:00'` |
| `java.time.ZonedDateTime` | `LONGVARCHAR` | `'2019-02-03T18:20:28.661Z[Europe/London]'` |


## `slick.jdbc.SQLServerProfile`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
| `java.time.Instant` | `DATETIMEOFFSET(6)` | `(convert(datetimeoffset(6), '2019-02-03 18:20:28.66 '))` |
| `java.time.LocalDate` | `DATE` | `'2019-02-03'` |
| `java.time.LocalTime` | `TIME(6)` | `(convert(time(6), '18:20:28.661'))` |
| `java.time.LocalDateTime` | `DATETIME2(6)` | `'2019-02-03 18:20:28.661'` |
| `java.time.OffsetTime` | `VARCHAR(MAX)` | `'18:20:28.661Z'` |
| `java.time.OffsetDateTime` | `DATETIMEOFFSET(6)` | `(convert(datetimeoffset(6), '2019-02-03 18:20:28.661 '))` |
| `java.time.ZonedDateTime` | `VARCHAR(MAX)` | `'2019-02-03T18:20:28.661Z[Europe/London]'` |


## `slick.jdbc.MySQLProfile`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
| `java.time.Instant` | `TEXT` | `'2019-02-03T18:20:28.660Z'` |
| `java.time.LocalDate` | `DATE` | `'2019-02-03'` |
| `java.time.LocalTime` | `TEXT` | `'18:20:28.661'` |
| `java.time.LocalDateTime` | `TEXT` | `'2019-02-03T18:20:28.661'` |
| `java.time.OffsetTime` | `TEXT` | `'18:20:28.661Z'` |
| `java.time.OffsetDateTime` | `TEXT` | `'2019-02-03T18:20:28.661Z'` |
| `java.time.ZonedDateTime` | `TEXT` | `'2019-02-03T18:20:28.661Z[Europe/London]'` |


## `slick.jdbc.OracleProfile`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
| `java.time.Instant` | `TIMESTAMP(9) WITH TIME ZONE` | `TO_TIMESTAMP_TZ('2019-02-03 18:20:28.660 +00', 'YYYY-MM-DD HH24:MI:SS.FF3 TZH')` |
| `java.time.LocalDate` | `DATE` | `TO_DATE('2019-02-03', 'SYYYY-MM-DD')` |
| `java.time.LocalTime` | `VARCHAR2(254)` | `'18:20:28.661'` |
| `java.time.LocalDateTime` | `TIMESTAMP` | `TO_TIMESTAMP('2019-02-03 18:20:28.661', 'YYYY-MM-DD HH24:MI:SS.FF3')` |
| `java.time.OffsetTime` | `TIMESTAMP(6) WITH TIME ZONE` | `TO_TIMESTAMP_TZ('1970-01-01 18:20:28.661 +0000', 'YYYY-MM-DD HH24:MI:SS.FF3 TZH:TZM')` |
| `java.time.OffsetDateTime` | `TIMESTAMP(6) WITH TIME ZONE` | `TO_TIMESTAMP_TZ('2019-02-03 18:20:28.661 +0000', 'YYYY-MM-DD HH24:MI:SS.FF3 TZH:TZM')` |
| `java.time.ZonedDateTime` | `TIMESTAMP(6) WITH TIME ZONE` | `TO_TIMESTAMP_TZ('2019-02-03 18:20:28.661 Europe/London', 'YYYY-MM-DD HH24:MI:SS.FF3 TZR')` |


## `slick.jdbc.PostgresProfile`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
| `java.time.Instant` | `TIMESTAMP` | `'2019-02-03 18:20:28.66'` |
| `java.time.LocalDate` | `DATE` | `'2019-02-03'` |
| `java.time.LocalTime` | `TIME` | `'18:20:28.661'` |
| `java.time.LocalDateTime` | `TIMESTAMP` | `'2019-02-03 18:20:28.661'` |
| `java.time.OffsetTime` | `TIMETZ` | `'18:20:28.661Z'` |
| `java.time.OffsetDateTime` | `VARCHAR` | `'2019-02-03T18:20:28.661Z'` |
| `java.time.ZonedDateTime` | `VARCHAR` | `'2019-02-03T18:20:28.661Z[Europe/London]'` |


## `slick.jdbc.SQLiteProfile`

| Java Type | SQL Type | Example SQL Literal |
|-----------|----------|---------------------|
| `java.time.Instant` | `TIMESTAMP` | `1549218028660` |
| `java.time.LocalDate` | `DATE` | `1549152000000` |
| `java.time.LocalTime` | `VARCHAR(254)` | `'18:20:28.661'` |
| `java.time.LocalDateTime` | `TIMESTAMP` | `1549218028661` |
| `java.time.OffsetTime` | `VARCHAR(254)` | `'18:20:28.661Z'` |
| `java.time.OffsetDateTime` | `VARCHAR(254)` | `'2019-02-03T18:20:28.661Z'` |
| `java.time.ZonedDateTime` | `VARCHAR(254)` | `'2019-02-03T18:20:28.661Z[Europe/London]'` |
