package com.knoldus

import java.io.File
class FileDirectory {

  def recursiveCallToSubDirectories(list:List[String]): Unit ={
    val lengthOFSubDirectoryList = list.length
    def tailRecursiveDirectories(listOfSubDir:List[String],level:Int) = {
      level match{
        case level
      }

    }
  }


}

object driver extends App {
  val mainDirPath = "/home/knoldus/Downloads/KIP Assignments Repository 2018/"
  val mainDir = new File(mainDirPath)
  val fileDir = new FileDirectory
  val listOfAllMainDirectoryFiles = mainDir.listFiles.map(_.getName).toList
  val listOfSubDirectories = mainDir.listFiles.filter(_.isDirectory).map(_.getName).toList
  fileDir.recursiveCallToSubDirectories(listOfSubDirectories)
}


