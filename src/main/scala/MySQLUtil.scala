import java.sql.Connection

object MySQLUtil extends DatabaseService {

  val connection: Connection = MySQL.connectToDatabase
  val fileName: String = "MySQLQueries"

}
