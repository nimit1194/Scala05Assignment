

object SQLite extends Database {

  override val url = "jdbc:sqlite:/home/knoldus/SQLIteTest.db"
  override val driver = "org.sqlite.JDBC"
  override val username = "root"
  override val password = "root"

}
