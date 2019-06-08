package pl.edu.pja.s13227.nbd

object Task3 {

  def main(args: Array[String]): Unit = {
    println("---------------------------------------------")
    println("Krotka z 3 wartosciami:")
    println("---------------------------------------------")

    val tuple = ("Krotka", 25.99, 'X')
    printTuple(tuple)

  }

  def printTuple(tuple3: (String, Double, Char)): Unit = {
    println(tuple3._1 + " " + tuple3._2 + " " + tuple3._3)
  }
}
