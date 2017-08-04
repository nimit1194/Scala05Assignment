
import java.sql.{Connection, DriverManager}

trait Database {

  val url: String = ""
  val driver: String = ""
  val username: String = ""
  val password: String = ""

  def connectToDatabase: Connection = {

    val connection: Connection = try {
      Class.forName(driver)
      DriverManager.getConnection(url, username, password)
    } catch {
      case ex: Exception => throw ex
    }

    connection
  }

  def executeQueries(testCase: TestCase, connection: Connection): Long = {

    val sqlQueryStatement = connection.createStatement()

    sqlQueryStatement.execute(testCase.preCondition)

    val start = System.nanoTime()

    sqlQueryStatement.execute(testCase.query)
    val end = System.nanoTime()
    sqlQueryStatement.execute(testCase.postCondition)
    end - start

  }

  def closeConnection(connection: Connection): Unit = {
    connection.close()
  }

}
