package pl.edu.pja.s13227.nbd

object Task5 {


  def main(args: Array[String]): Unit = {
    println("---------------------------------------------")
    println("Pattern matching:")
    println("---------------------------------------------")

    println("Poniedzialek: " + isWeekend("Poniedzialek"))
    println("Wtorek: " + isWeekend("Wtorek"))
    println("Sroda: " + isWeekend("Sroda"))
    println("Czwartek: " + isWeekend("Czwartek"))
    println("Piatek: " + isWeekend("Piatek"))
    println("Sobota: " + isWeekend("Sobota"))
    println("Niedziela: " + isWeekend("Niedziela"))
    println("Magiczny dzien: " + isWeekend("Magiczny dzien"))

  }

  def isWeekend(day: String): String = day match {

    case "Poniedzialek" | "Wtorek" | "Sroda" | "Czwartek" | "Piatek" => "Praca"
    case "Sobota" | "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}
