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
    println("---------------------------------------------")
    println("1a) Petla for:")
    println("---------------------------------------------")

    for (day <- weekDays) {
      println(day)
    }

    println("---------------------------------------------")
    println("1b) Petla for, dni zaczynajace sie na 'P':")
    println("---------------------------------------------")

    for (day <- weekDays) {
      if (day.startsWith("P")) {
        println(day)
      }
    }

    println("---------------------------------------------")
    println("1c) Metoda forEach:")
    println("---------------------------------------------")

    weekDays.foreach( { println } )

    println("---------------------------------------------")
    println("1d) Petla while:")
    println("---------------------------------------------")

    var i = 0
    while (i < weekDays.length) {
      println(weekDays(i))
      i = i + 1
    }

    println("---------------------------------------------")
    println("1e) Funkcja rekurencyjna:")
    println("---------------------------------------------")

    recursivePrint(0, weekDays)

    println("---------------------------------------------")
    println("1f) Odwrocona funkcja rekurencyjna:")
    println("---------------------------------------------")

    reversePrint(weekDays)

    println("---------------------------------------------")
    println("1g) Metoda foldl:")
    println("---------------------------------------------")

    weekDays.foldLeft()((a, b) => println(b))

    println("---------------------------------------------")
    println("1g) Metoda foldr:")
    println("---------------------------------------------")

    weekDays.foldRight()((a, b) => println(a))

    println("---------------------------------------------")
    println("1h) Metoda foldl, dni zaczynajace sie na 'P':")
    println("---------------------------------------------")

    weekDays.foldLeft()((a, b) => if (b.startsWith("P")) println(b))

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

  def reversePrint(list: List[String]): Unit = {
    reverseRecursivePrint(list.size-1, list)
  }


}
