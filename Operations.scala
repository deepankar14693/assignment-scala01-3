package com.knoldus

object Operations {

 def listAddition(firstlist:List[Int],secondlist:List[Int]): List[Int] = if(firstlist.size == secondlist.size)
  {
   val addBoth = for(i <- 0  until firstlist.length) yield { firstlist(i) + secondlist(i)}
   addBoth.toList
  }
 else
  List()

def findElementByIndex(x:Int,list: List[Int]):Int = {
 /*val x=for(r <-list if(list.indexOf(r)==x)) yield r
 x.toList
 x.head*/
 list(x)
}

 def reverseElements(list:List[Int]):List[Int] = {
  val rev=for(r <-list.length-1 to 0 ) yield r
  rev.toList
 }
 /*def fibbonacciCalculation(number:Int): Unit = {
  def tailFib(n:Int,res:Int): Int = {
  n match {
   case 0 => 0
   case 1 => 1
    case_ => tailFib(n)
  }
print(tailFib(0,number)
)
  }
 }*/

def doubleElements(list: List[Int]): List[Int] = list.map(x => x * 2)

 def areaCalculate(shape : String,firstval : Int,secondval : Int,f:(Int,Int)=>Int):Unit ={
  println(s"area of $shape is $f")
 }

 def main(args:Array[String])
 {
  val index:Int=6
  val double=List(20,30,25,40)
  val integrate1=List(11,12,13,14)
  val integrate2=List(1,2,3,4)
  doubleElements(double)
  println(areaCalculate("rectangle",2,3,(x,y) => x * y))
  println(findElementByIndex(index,double))
  val listsadded=listAddition(integrate1,integrate2)
  println(listsadded)
  val reversed=reverseElements(integrate1)
  println(reversed)
 }
}
