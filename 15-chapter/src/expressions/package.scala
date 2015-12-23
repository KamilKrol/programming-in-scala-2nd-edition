/**
  * Created by kamil on 23.12.15.
  */
package object expressions {

  sealed abstract class Expr

  case class Var(name: String) extends Expr

  case class Num(num: Double) extends Expr

  case class UnOp(operator: String, arg: Expr) extends Expr

  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e
    case UnOp("abs", e@UnOp("abs", _)) => e
    case BinOp("*", e, Num(1)) => e
    case BinOp("+", e, Num(0)) => e
    case _ => expr
  }

  def simplifyAdd(expr: Expr): Expr = expr match {
    case BinOp("+", x, y) if x == y => BinOp("*", Num(2), x)
    case _ => expr
  }

  def simplifyAll(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => simplifyAll(e)
    case UnOp("abs", e@UnOp("abs", _)) => e
    case BinOp("+", e, Num(0)) => simplifyAll(e)
    case BinOp("*", e, Num(1)) => simplifyAll(e)
    case UnOp(op, e) => UnOp(op, simplifyAll(e))
    case BinOp("+", x, y) if x == y => BinOp("*", Num(2), simplifyAll(x))
    case BinOp(op, l, r) => BinOp(op, simplifyAll(l), simplifyAll(r))
    case _ => expr
  }

  def describe(expr: Expr) = (expr: @unchecked) match {
    case Num(_) => "a number"
    case Var(_) => "a variable"
  }

}
