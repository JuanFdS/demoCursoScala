type Price = Int

class Order(price : Price, description : String, shippingType : ShippingType)

abstract class ShippingType {
  def additionalPrice : Price
}

class Standard extends ShippingType {
  def additionalPrice = 0
}

class Rush extends ShippingType {
  def additionalPrice = 10
}

class SuperRush extends ShippingType {
  def additionalPrice = 40
}

//vs
//
//sealed abstract class ShippingType {
//  case object Standard extends ShippingType
//
//  case object Rush extends ShippingType
//
//  case object SuperRush extends ShippingType
//
//
//  def price(shippingType : ShippingType) = shippingType match {
//    case Standard ⇒ 0
//    case Rush ⇒ 10
//    case SuperRush ⇒ 40
//  }
//}