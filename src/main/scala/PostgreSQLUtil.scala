
import java.sql.Connection

object PostgreSQLUtil extends DatabaseService{

  val connection:Connection= PostgreSQL.connectToDatabase
  val fileName:String="PostgreSQLQueries"

}
