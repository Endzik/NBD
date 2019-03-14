package pl.edu.pja.s13227.nbd

object Task1 {

  val weekDays: List[String] = List(
    "Poniedzialek",
    "Wtorek",
    "Sroda",
    "Czwartek",
    "Piatek",
    "Sobota",
    "Niedziela"
  )

  def main(args: Array[String]): Unit = {
    println("--------------------------------------")
    println("Petla for:")
    println("--------------------------------------")

    for ( day <- weekDays) {
      println(day)
    }

    println("--------------------------------------")
    println("Petla for, dni zaczynajace sie na 'P':")
    println("--------------------------------------")

    for ( day <- weekDays) {
      if (day.startsWith("P")) {
        println(day)
      }
    }

    println("--------------------------------------")
    println("Metoda forEach:")
    println("--------------------------------------")

    weekDays.foreach( { println } )

    println("--------------------------------------")
    println("Petla while:")
    println("--------------------------------------")

    var i = 0
    while (i < weekDays.length) {
      println(weekDays(i))
      i = i + 1
    }

    println("--------------------------------------")
    println("Funkcja rekurencyjna:")
    println("--------------------------------------")

    recursivePrint(0, weekDays)

    println("--------------------------------------")
    println("Odwrocona funkcja rekurencyjna:")
    println("--------------------------------------")

    reverseRecursivePrint(6, weekDays)

  }

  def recursivePrint(i : Int, list: List[String]): Unit = {
    if (i < 0 || i >= list.length) {
      return
    }
    println(list(i))
    recursivePrint(i + 1, list)
  }

  def reverseRecursivePrint(i : Int, list: List[String]): Unit = {
    if (i < 0 || i >= list.length) {
      return
    }
    println(list(i))
    reverseRecursivePrint(i - 1, list)
  }
}
