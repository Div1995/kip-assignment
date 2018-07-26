import java.io.File
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Failure
import scala.util.Success

class FileDirectory {
  def recursionForDirectories(path:String):List[File] ={
    val rootPath = new File(path)
    def recursionForSubDirectories(dirFolder: List[File], result: List[File]): List[File] = {
      dirFolder match{
        case List(a,_*) => recursionForSubDirectories(a.listFiles().filter(_.isDirectory).toList ::: dirFolder.tail,
          result ::: a.listFiles().filter(_.isFile).toList)
        case _ => result
      }
    }

      recursionForSubDirectories(List(rootPath), List())
  }
}
object FileDirectory extends App {
  val fileDir = new FileDirectory
  val detailOfDirectory = Future(fileDir.recursionForDirectories("/home/knoldus/Downloads/KIP Assignments Repository 2018/"))
  Thread.sleep(1000)
  detailOfDirectory onComplete{
    case Success(directory) => println(directory.map{
      file => file.getName
    })
    case Failure(ex) => println("Error")
  }
  Thread.sleep(1000)
}