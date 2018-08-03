package classParameters.scala

class User(private var _username : String,
           private var password : String,
           var email : String,
           private var _orders : List[Order]) {

  def username = _username

  def orders = _orders

}