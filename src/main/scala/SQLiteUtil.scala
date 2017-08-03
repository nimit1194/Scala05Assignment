import java.sql.Connection

object SQLiteUtil extends DatabaseService {

  override val connection: Connection = SQLite.connectToDatabase
  val fileName: String = "SQLiteQueries"

}
