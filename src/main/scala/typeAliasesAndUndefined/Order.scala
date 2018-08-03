package object typeAliasesAndUndefined {


  class Order(lineItems : List[LineItem], description : String) {
    def price
  }

  class LineItem(val price : Int, val quantity : Int)
}