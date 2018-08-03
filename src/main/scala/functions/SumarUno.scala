package object funciones {

  // sumarUno :: Int -> Int
  val sumarUno: Function[Int, Int] = numero => numero + 1

  // sumarUno :: Int -> Int -> Int
  val suma: Function2[Int, Int, Int] = (sumando, otroSumando) => sumando + otroSumando

}
