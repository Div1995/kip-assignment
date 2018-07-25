package org.knoldus

class QuestionFirst {

  def max(list: List[Int]): Int = {
    require(list.nonEmpty, "The List passed is Empty")
    def maxElement(list1: List[Int], result: Int): Int = {
      list1 match {
        case Nil => result
        case _ => maxElement(list1.tail, if (result > list1.head) result else list1.head)
      }
    }
    maxElement(list.tail,list.head)
  }

  def length(list: List[Any]):Int = {
    list match{
        case Nil => 0
        case _ => length(list.tail) + 1
      }
    }

  def elementFromLast(list:List[Any],elementNumber:Int):Any ={
    require(list.length >= elementNumber,"List not of sufficient size")
    list.length - elementNumber match{
      case 0 => list.head
      case _ => elementFromLast(list.tail,elementNumber)
    }
  }

  def min(list: List[Int]): Int = {
    require(list.nonEmpty, "The List passed is Empty")
    def minElement(list1: List[Int], result: Int): Int = {
      list1 match {
        case Nil => result
        case _ => minElement(list1.tail, if (result < list1.head) result else list1.head)
      }
    }
    minElement(list.tail,list.head)
  }
}
