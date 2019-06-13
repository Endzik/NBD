package pl.edu.pja.s13227.nbd

object Task10 {

  def main(args: Array[String]): Unit = {
    println("---------------------------------------------")
    println("AbsolutesBetween:")
    println("---------------------------------------------")

    val numbers = List(-6.5, 1.23, 2.45, -0.1, 30.4, 0.65, -4.99, -5.01, 16, 12.005, 0, 7, 8, 0, 9, 0)
    println("Initial list: " + numbers)
    println("Result list: " + absolutesBetween(numbers))
  }

  def absolutesBetween(list: List[Double]) :List[Double] = {
    list.filter(x => x >= -5 && x <= 12).map(x => Math.abs(x))
  }
}
