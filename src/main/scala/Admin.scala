

object Admin extends App with Database {


  MySQLUtil.queryTime("/home/knoldus/FrameWorkTutorail/ScalaCapstoneProject/CSVInputFiles/MySQLDDL.csv")
  PostgreSQLUtil.queryTime("/home/knoldus/FrameWorkTutorail/ScalaCapstoneProject/CSVInputFiles/PostgreSQLDDL.csv")
    SQLiteUtil.queryTime("/home/knoldus/FrameWorkTutorail/ScalaCapstoneProject/CSVInputFiles/SQLiteDDL.csv")


}
