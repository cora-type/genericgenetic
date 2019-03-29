package genetics

import genetics.geometry._
import genetics.genes._

object GeneticAlgorithm {

  def linearRegression[Line](input: List[Point]): Line = {
    val x: List[Gene] = List(new Gene(.6), new Gene(.7))
    geneticAlgorithm(distance(input), geneToLine(x), x)
  }

  def distance(inputData: List[Point]): Line => Double = {
    line: Line => {
      var sum: Double = 0
      for (points <- inputData){
        sum += Math.abs(points.y) - Math.abs(line.evaluate(points.x))
      }
      sum
    }
  }

  def geneToLine(inputData: List[Gene]) : Line = {
    var x = new Line(inputData(0).geneValue, inputData(1).geneValue)
  }

  def geneticAlgorithm[Line](distant: Line => Double, geneToL: List[Gene] => Line, list:List[Gene]): Line ={

  }

}
