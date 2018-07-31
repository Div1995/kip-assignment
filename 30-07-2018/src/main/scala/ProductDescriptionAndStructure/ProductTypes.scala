package ProductDescriptionAndStructure

import com.knoldus.PercentageVatRate

class Medical(val nameOfProduct:String,val priceOfProduct:Double,val quantityOfProduct:Int) extends ProductDescription {

  override def productPriceIncludingVat: Double = priceOfProduct
}

class NonMedical(val nameOfProduct:String,val priceOfProduct:Double,val quantityOfProduct:Int) extends ProductDescription with PercentageVatRate{

  override def productPriceIncludingVat: Double = priceOfProduct + (priceOfProduct*vatRate)/100
}
