package com.knoldus

import ProductDescriptionAndStructure._
import org.scalatest.{FunSuite, Matchers}

class CalculateTotalBillSpec extends FunSuite with Matchers {

  val calculateBill = new CalculateTotalBill

  test("Checking for valid type of objects."){

  val listOfProduct:List[ProductDescriptionAndStructure.ProductDescription] = List(
  new Medical("Crocin",60, 1),
  new NonMedical("Milk", 40, 1),
  new NonMedical("Sugar", 50,1),
  new NonMedical("Maggi", 20,1)
  )
  val actualResult = calculateBill.totalBillCalculator(listOfProduct)
  val expectedReusult = 172.75
  expectedReusult shouldBe actualResult
}

}
