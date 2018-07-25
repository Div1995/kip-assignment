package org.knoldus

case class Student(id:Int,name:String,division:Int,section:String)
case class ScoreCard(studentId:Int,totalMarks:Double,subject1:Double,subject2:Double,subject3:Double)

object ScoreCard{
  def apply(id:Int,subject1:Double,subject2:Double,subject3:Double):ScoreCard ={
    val totalMarks = subject1+subject2+subject3
    new ScoreCard(id,totalMarks,subject1,subject2,subject3)
  }
}
class QuestionThird {

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

    def topThreeOfClass(listOfStudents:List[Student],listOfScoreCard:List[ScoreCard]):List[String] ={
    val listOfMaxcard = listOfScoreCard.sortWith(_.totalMarks > _.totalMarks).slice(0,3)
    listOfMaxcard.map(_.studentId)

  }


  /*val c = new C(1)
  val a = new A(1)
  c.param
  a.param
}

class A(param : Any)
class B(val param : Any)
class C(t: Any){
  private val param : Any = t
}*/


