//import java.io.File

//import com.knoldus.driver.{mainDir, mainDirPath}
import java.io.File
/*
val mainDirPath = "/home/knoldus/Downloads/KIP Assignments Repository 2018/"
val mainDir = new File(mainDirPath).listFiles
for(f <- mainDir)
{
  println(f)
}*/

/*if(mainDir.exists() && mainDir.is)
)


import java.io.File
def recursiveListFiles(f: File): Array[File] = {
  val these = f.listFiles
  these ++ these.filter(_.isDirectory).flatMap(recursiveListFiles)
}
val mainDirPath = "/home/knoldus/Downloads/KIP Assignments Repository 2018/"
val mainDir = new File(mainDirPath)
recursiveListFiles(mainDir)

import java.nio.file.{FileSystems, Files}
import scala.collection.JavaConverters._
val dir = FileSystems.getDefault.getPath("/home/knoldus/Downloads")
Files.walk(dir).iterator().asScala.filter(Files.isRegularFile(_)).foreach(println)
*/
val mainDirPath = "/home/knoldus/Downloads/KIP Assignments Repository 2018/"
val mainDir = new File(mainDirPath)
mainDir.listFiles.toList.map(_.getName)