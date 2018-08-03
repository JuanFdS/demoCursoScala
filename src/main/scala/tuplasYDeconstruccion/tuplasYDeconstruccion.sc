val coordenada : (Int, Int) = (1, 2)
































class Order(lineItems : List[Item], description : String)

class Item(val price : Int, val quantity : Int)

val remerasDeOrdenDeJuan = new Item(50, 3)
val tazasDeOrdenDeJuan = new Item(25, 3)
val ordenDeJuan = new Order(List(remerasDeOrdenDeJuan,  tazasDeOrdenDeJuan), "Orden de Juan")


val stickersDeOrdenDeErwin = new Item(10, 15)
val remerasDeOrdenDeErwin = new Item(50, 2)
val ordenDeErwin = new Order(List(stickersDeOrdenDeErwin ,  remerasDeOrdenDeErwin ), "Orden de Erwin")


val ordenes = List(ordenDeJuan, ordenDeErwin)

//queremos tener List((remerasDeJuan, "ordenDeJuan"),
//                    (tazasDeOrdenDeJuan, "ordenDeJuan"),
//                    (remerasDeOrdenDeErwin, "ordenDeErwin"),
//                    (stickersDeOrdenDeErwin, "ordenDeErwin"))










