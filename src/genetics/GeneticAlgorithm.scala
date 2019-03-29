package genetics

import genetics.geometry._
import genetics.genes._

object GeneticAlgorithm {

  def linearRegression[(input: List[Point]): Line = {
    val x: List[Gene] = List(new Gene(.6), new Gene(.7))
    geneticAlgorithm(fitFunc(input), x => geneToLine(x) , x)
  }



  def fitFunc(inputData: List[Point]): Line => Double = {
    lineInput: Line => {
      var total: Double = 0
      for (points <- inputData){
        total = total + Math.abs(points.y) - Math.abs(lineInput.evaluate(points.x)) // evaluates to see how well line fits the points, closer the better
      }
      total
    }
  }

  def geneToLine(inputData: List[Gene]) : Line = {
    val x = new Line(inputData(0).geneValue, inputData(1).geneValue)
    x
  }

  def geneticAlgorithm[T](fitFunc: T => Double, geneToL: List[Gene] => T, list:List[Gene]): T ={
    new T
  }
}
