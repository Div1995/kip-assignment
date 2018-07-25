package org.knoldus

class QuestionSecond {

  def patternMatching(inputElement:Any):String ={

    inputElement match{
      case inputElement:Int => s"thanks for the Int:$inputElement"
      case inputElement:String => s"you gave me this string:$inputElement"
      case inputElement:Float => s"you gave me this Float:$inputElement"
      case _:Array[Int] => s"you gave me this Array of Integers"
      case _:Array[String] => s"you gave me this Array of Strings"
      case _:List[Any] => "you gave me this List"
      case _:Map[_,_] => "you gave me this map"
      case _:Pet => "you gave me the case class pet"
      case _ => "Not recognized"
    }

  }

}
case class Pet(name:String)
