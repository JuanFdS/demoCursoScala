class Order(lineItems : List[Item], description : String)

class Item(val price : Int, val quantity : Int)

import scala.util.Try

class SafeOrderRepository {
  val orders = for { x ← 1 to 25 }
    yield (new Order(lineItems = List(), description = "Something Something"))

  def findBy(orderNumber: Int) : Option[Order] = Try(orders(orderNumber)).toOption
}

class OrderRepository {
  val orders = for { x ← 1 to 25 }
    yield (new Order(lineItems = List(), description = "Something Something"))

  def findBy(orderNumber: Int) : Order = try { orders(orderNumber) } catch { case _ ⇒ null }
}














val orderRepository = new OrderRepository()



















































