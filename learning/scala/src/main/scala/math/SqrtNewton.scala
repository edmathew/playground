package math

object SqrtNewton {

  /**
   * Implements sqrt using newton methods
   */
  def sqrt(guess: Double, x: Double): Double = {
    if (isGoodEnough(guess, x))
      guess
    else
      sqrt(improve(guess, x), x);
  }

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) < 0.01

  def improve(guess: Double, x: Double) =
    ((guess + x) / guess) / 2

  def abs(x: Double) =
    if (x < 0)
      -x
    else
      x

}
