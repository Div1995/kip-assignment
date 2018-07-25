case class Student(id:Int,name:String,division:Int,section:String)
case class ScoreCard(studentId:Int,totalMarks:Double,subject1:Double,subject2:Double,subject3:Double)

object ScoreCard{
  def apply(id:Int,subject1:Double,subject2:Double,subject3:Double):ScoreCard ={
    val totalMarks = subject1+subject2+subject3
    new ScoreCard(id,totalMarks,subject1,subject2,subject3)
  }
}

  val listOfStudents: List[Student] = List(
    Student(1, "Bob", 11, "A"),
    Student(2, "Dab", 10, "C"),
    Student(3, "Tab", 10, "B")
  )

  val listOfScoreCard: List[ScoreCard] = List(
    ScoreCard(1, 88.0f, 45.0f, 79.0f),
    ScoreCard(2, 67.0f, 80.0f, 45.0f),
    ScoreCard(3, 99.0f, 87.0f, 85.0f)
  )

listOfScoreCard.sortWith(_.totalMarks > _.totalMarks).slice(0,3).map(_.studentId).map(studentId => listOfStudents.filter(_.id == studentId))




/*val list =List(1,2,3)
  list match{
    case (x,_,_) => "hi"
    case _ => "hello"
  }


val method = {
  90 + 90
}*/

val list1: List[Int] = List(1,2,3)
val list2: List[Int] = List(3,2,1)

/*list1.withFilter(l1 => l1 >= 5).
  list2.map{
    l2 => l1 + l2
  }
*/

for{
  l1 <- list1
  l2 <- list2
} yield l1+l2

for{
  l1 <- list1
} yield l1+1

def incre(list:Int):Int = list1 + 1