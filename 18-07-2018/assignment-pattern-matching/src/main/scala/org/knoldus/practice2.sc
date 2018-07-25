case class Person(name:String,bool:Boolean)


val persons = List(

  Person("PK",false),
  Person("JS",true)

)

for{

  person <- persons
  name = person.name

}yield name

/*val regex =" ".r
regex.findAllIn(test).toList
*/

@deprecated("My Message","Too String")
def hello = 1+1
hello

val value: Option[String] = None

value match {
  case Some(test) => println(test)
  case _ => println("everything")

}