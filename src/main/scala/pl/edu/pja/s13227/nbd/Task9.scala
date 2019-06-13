package pl.edu.pja.s13227.nbd

object Task9 {

  def main(args: Array[String]): Unit = {
    println("---------------------------------------------")
    println("IncrementAll:")
    println("---------------------------------------------")

    val ints = List(0, 1, 2, 0, 3, 0, 4, 5, 6, 0, 0, 7, 8, 0, 9, 0)
    println("Initial list: " + ints)
    println("Incremented list: " + incrementAll(ints))
  }

  def incrementAll(list: List[Int]) :List[Int] = {
    list.map(i => i + 1)
  }
}
