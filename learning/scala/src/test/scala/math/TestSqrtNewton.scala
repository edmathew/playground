package math

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestSqrtNewton extends FunSuite{

  test("sqrt of 2 ") (
    assert (SqrtNewton.sqrt(1, 2) == 1,4142156)
  )
  
}
