import scala.util.{Failure,Success}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Example extends App{
  def divide(a:Int,b:Int) = Future{
    a/b
  }
       val result = divide(1,0)
        result.onComplete {
          case Success(result) => println(s"$result")
          case Failure(ex) => println(ex.getStackTrace)
 }
  Thread.sleep(3000)

}
