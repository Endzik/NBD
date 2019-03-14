package pl.edu.pja.s13227.nbd

object Task1 extends App {

  val weekDays: List[String] = List(
    "Poniedzialek",
    "Wtorek",
    "Sroda",
    "Czwartek",
    "Piatek",
    "Sobota",
    "Niedziela"
  )

  println("----------")
  println("Petla for:")
  println("----------")

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
}
