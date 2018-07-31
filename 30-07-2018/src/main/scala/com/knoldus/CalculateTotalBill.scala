package com.knoldus

import ProductDescriptionAndStructure.ProductDescription


class CalculateTotalBill {
  def totalBillCalculator(productList:List[ProductDescription]):Double = {
    def totalBillCalculation(productList: List[ProductDescription],totalBill: Double): Double = {
      productList match {
        case h::tail => totalBillCalculation(tail,totalBill + (h.quantityOfProduct * h.productPriceIncludingVat))
        case Nil => totalBill
      }
    }
    totalBillCalculation(productList,0)
  }
}
