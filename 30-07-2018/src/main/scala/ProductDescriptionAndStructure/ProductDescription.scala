package ProductDescriptionAndStructure

abstract class ProductDescription {
  val nameOfProduct:String
  val priceOfProduct:Double
  val quantityOfProduct:Int
  def productPriceIncludingVat:Double
}
