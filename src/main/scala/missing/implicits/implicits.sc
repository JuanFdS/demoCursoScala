type TuplaDePuntos = (Int, Int)

object Point {
  implicit def fromPoint: Point => TuplaDePuntos = point => (point.x, point.y)
}

case class Point(x: Int, y: Int) {
  def +(point: Point): Point = ???
}

object Origen extends Point(0, 0)


(1, 2) + Origen

(0, 1) + (1, 0)

val coordenadas: List[TuplaDePuntos] = List(Point(0, 0))



