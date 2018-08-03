package object typeAliasesAndUndefined {


  class Order(lineItems : List[Item], description : String) {
    def price
  }

  class Item(val price : Int, val quantity : Int)
}