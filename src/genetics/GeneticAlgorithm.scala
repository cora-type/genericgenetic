package genetics

import genetics.geometry._
import genetics.genes._

object GeneticAlgorithm {


  def shortestDistance(inputData: List[Point]): Double = {
    val number: Double = inputData(0).y + inputData(1).y
    val actual: Double = (number/100) - .5
    actual
  }

  def geneToLine(inputData: List[Gene]) : Line = {
    new Line(inputData(0).geneValue, inputData(1).geneValue)
  }

  def geneticAlgorithm[T](distance: T => Double, geneToL: List[Gene] => T, list:List[Gene]): T ={

  }

  def main(args: Array[String]): Unit = {
    val listOfPoints: List[Point] = List(new Point(1,2), new Point(1,1))
    val retur = shortestDistance(listOfPoints)
    println(retur)
  }
  /*def main(args: Array[String]): Unit = {
    val listOfPoints: List[Gene] = List(new Gene(.5), new Gene(.5))
    val retur = geneToLine(listOfPoints)
    println(retur)
  }*/

}
