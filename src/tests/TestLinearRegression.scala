package tests

import org.scalatest._
import genetics.geometry._
import genetics.GeneticAlgorithm

class TestLinearRegression extends FunSuite {
  test("Yeet"){
    val listOfPoints: List[Point] = List(new Point(4,5), new Point(1,2))
    val actual: Line = GeneticAlgorithm.linearRegression[Line](listOfPoints)

    assert(actual== actual)
  }
}
