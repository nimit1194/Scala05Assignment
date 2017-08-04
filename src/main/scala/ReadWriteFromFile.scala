

import java.io.{File, PrintWriter}
import scala.io.Source.fromFile


object ReadWriteFromFile extends ReadWrite {

  def read(fileLocation: String): String = {

    val file = new File(fileLocation)

    lazy val bufferedSource = fromFile(file)
    try {
      //bufferedSource = fromFile(file)
      val fileContent = bufferedSource.getLines.mkString("\n")
      bufferedSource.close()
      fileContent
    }

    catch {
      case ex:Exception => throw new Exception("Error in reading file")
    }

  }

  def write(fileName: String, content: String, dirPath: String): Boolean = {

    new File(dirPath).mkdir()

    val writeToFile = new PrintWriter(dirPath + "/" + fileName)

    try {
      writeToFile.write(content)
      writeToFile.close()
      true
    }

    catch {
      case ex:Exception => false
    }

  }

}
