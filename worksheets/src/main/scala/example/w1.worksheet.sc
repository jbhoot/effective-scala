import ShapeCount.One
import User.Registered

import scala.language.postfixOps

1 + 1

val x = 42

x * x

x / 2

1.==(0)

1.>(0)

1 max 0

1 min 0

val facade = 5 * 3
val door = 1 * 2
facade - door

// true combine false

// true && "false"

case class Square(side: Int):
  val area = side * side

val window = Square(side = 4)
window.area

case class Circle(radius: Int):
  val area = Math.PI * radius * radius

val hobbitWindow = Circle(radius = 3)
hobbitWindow.area

sealed trait User

object User:
  case object Guest extends User

  case class Registered(id: String) extends User

val reg = User.Registered("1")
User
User.Guest

enum Shape:
  case Diamond, Squiggle, Oval

enum ShapeCount:
  case One, Two, Three

enum Shading:
  case Solid, Striped, Open

enum Color:
  case Red, Green, Purple

case class Card(shape: Shape, count: ShapeCount, shading: Shading, color: Color)

def isSet(one: Card, two: Card, three: Card) =
  ((one.shape == two.shape && two.shape == three.shape) || (one.shape != two.shape && two.shape != three.shape && one.shape != three.shape))
    && ((one.count == two.count && two.count == three.count) || (one.count != two.count && two.count != three.count && one.count != three.count))
    && ((one.shading == two.shading && two.shading == three.shading) || (one.shading != two.shading && two.shading != three.shading && one.shading != three.shading))
    && ((one.color == two.color && two.color == three.color) || (one.color != two.color && two.color != three.color && one.color != three.color))

val one = Card(Shape.Diamond, ShapeCount.One, Shading.Open, Color.Green)
val two = Card(Shape.Squiggle, ShapeCount.Two, Shading.Open, Color.Green)
val three = Card(Shape.Oval, ShapeCount.Three, Shading.Open, Color.Green)

isSet(one, two, three)