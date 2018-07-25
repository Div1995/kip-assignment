object monthYear extends Enumeration{
  type monthYear = Value
  val jan,feb,mar,apr,may,jun,july,aug,sep,oct,nov,dec = Value

}

case class presentMonth(name:String,yearMonth:monthYear.Value)
val obj1 = presentMonth("john",monthYear.feb)
obj1.yearMonth

