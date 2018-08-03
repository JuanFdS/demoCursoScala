def incrementarEnUno: Int => Int = _ + 1

List(1, 2, 3).map(numero => incrementarEnUno(numero))
