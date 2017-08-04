name := "ScalaCapstoneProject"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.6"

libraryDependencies += "postgresql" % "postgresql" % "9.1-901-1.jdbc4"

libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.19.3"

libraryDependencies += "log4j" % "log4j" % "1.2.17"

libraryDependencies += "org.mockito" % "mockito-all" % "1.9.5" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"