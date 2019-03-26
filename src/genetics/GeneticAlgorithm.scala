package genetics

import genetics.geometry._
import genetics.genes._

object GeneticAlgorithm {

  def linearRegression[Line](input: List[Point]): Line = {
    val x: List[Gene] = List(new Gene(.6), new Gene(.7))
    geneticAlgorithm[Line](distance(input), geneToLine(x), x)
  }

  def distance[T](inputData: List[Point]): T => Double = (x :T) => { //(4,5)(2,3) - (4,4)(2,2)
    inputData(0).y + inputData(1).y
  }

  def geneToLine[T](inputData: List[Gene]) : T = {
    new T(inputData(0).geneValue, inputData(1).geneValue)
  }

  def geneticAlgorithm[T](distant: T => Double, geneToL: List[Gene] => T, list:List[Gene]): T ={
    new T
  }

}
