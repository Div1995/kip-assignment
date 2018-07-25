import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object Example extends App{

  val result = Future{   //wrapped in future
    2+2
  }
  Thread.sleep(3000)
  println(s"**************$result")

}