
class Point(var x: Int, var y: Int) {
  //override def hashCode = (x, y).##
  override def equals(that: Any): Boolean = that match {
    case that: Point => (this canEqual that) && that.x == this.x && that.y == this.y
    case _ => false
  }
  def canEqual(other: Any)= other.isInstanceOf[Point]
}

val p1 = new Point(1,2)
val p2 = new Point(1,2)
val p3 = new Point(1,2)

p1.hashCode
p2.hashCode
p1 equals p2


val coll = scala.collection.mutable.HashSet(p1)
p1.hashCode

p1.y+=1
coll contains p1
p1.hashCode


/*
class Point(val x: Int, val y: Int) {
  override def hashCode = (x, y).##
  override def equals(that: Any): Boolean = that match {
    case that: Point => (this canEqual that) && that.x == this.x && that.y == this.y
    case _ => false
  }
  def canEqual(other: Any)= other.isInstanceOf[Point]
}

val p1 = new Point(1,2)
val p2 = new Point(1,2)
val p3 = new Point(1,2)

p1.hashCode
p2.hashCode
p1 equals p2


val coll = scala.collection.mutable.HashSet(p1)

/*coll contains p2
coll contains p1
p1.hashCode
//p1.x += 1
p1
coll
coll.iterator contains p1

object Color extends Enumeration {
  val Red, Orange, Yellow, Green, Blue, Indigo, Violet = Value
}

class colouredPoint(x:Int,y:Int, val cp:Color.Value) extends Point(x,y){
override def equals(other :Any):Boolean = other match{
  case that: colouredPoint  =>  (this canEqual that) && that.cp == this.cp && super.equals(that)
  case _ => false
    }
  }

val o1 = new colouredPoint(1,2,Color.Blue)
val o2 = new colouredPoint(1,2,Color.Red)
val o3 = new colouredPoint(1,2,Color.Green)

o1 equals(p2)
p2 equals(o2)
o1 equals(o2)

o1 equals o2
o1 equals(p2)
p2 equals(o1)

println(o1)
println(p2)


p1 equals p1

p2 equals p2

p1 equals p2

p2 equals p1

p1 equals p2
p2 equals p3
p1 equals p3/*

val pAnon = new Point(1,1) {override val y = 2}
p2 equals pAnon
println(p2)
*/
println(this)

val pAnon1 = new Point(1,1) {override y =2 }

val coll1 = scala.collection.mutable.HashSet(pAnon1)

coll1 contains pAnon1

//pAnon1.y += 1
coll1
coll1 contains pAnon1

//coll contains p1
p1.hashCode
//p1.x += 1
p1
coll
coll.iterator contains p1

object Color extends Enumeration {
  val Red, Orange, Yellow, Green, Blue, Indigo, Violet = Value
}

class colouredPoint(x:Int,y:Int, val cp:Color.Value) extends Point(x,y){
override def equals(other :Any):Boolean = other match{
  case that: colouredPoint  =>  (this canEqual that) && that.cp == this.cp && super.equals(that)
  case _ => false
    }
  }

val o1 = new colouredPoint(1,2,Color.Blue)
val o2 = new colouredPoint(1,2,Color.Red)
val o3 = new colouredPoint(1,2,Color.Green)

o1 equals(p2)
p2 equals(o2)
o1 equals(o2)

o1 equals o2
o1 equals(p2)
p2 equals(o1)

println(o1)
println(p2)


p1 equals p1

p2 equals p2

p1 equals p2

p2 equals p1

p1 equals p2
p2 equals p3
p1 equals p3/*

val pAnon = new Point(1,1) {override val y = 2}
p2 equals pAnon
println(p2)
*/
println(this)

val pAnon1 = new Point(1,1) {override y =2 }

val coll1 = scala.collection.mutable.HashSet(pAnon1)

coll1 contains pAnon1

//pAnon1.y += 1
coll1
coll1 contains pAnon1
*/