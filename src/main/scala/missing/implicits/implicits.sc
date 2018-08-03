type TuplaDePuntos = (Int, Int)

object Point {
  implicit def fromPoint: Point => TuplaDePuntos = point => (point.x, point.y)
}

case class Point(x: Int, y: Int) {
  def +(point: Point): Point = ???
}

object Origen extends Point(0, 0)



