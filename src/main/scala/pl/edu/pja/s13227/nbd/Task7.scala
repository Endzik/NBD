package pl.edu.pja.s13227.nbd

object Task7 {

  def main(args: Array[String]): Unit = {
    println("---------------------------------------------")
    println("Osoba:")
    println("---------------------------------------------")

    val michal1 = new Osoba("Michal", "Malinowski")
    val michal2 = new Osoba("Michal", "Kowalski")
    val piotrek = new Osoba("Piotrek", "Swiadek")
    val random1 = new Osoba("Marcin", "Wasowski")

    println(greet(michal1))
    println(greet(michal2))
    println(greet(piotrek))
    println(greet(random1))
  }

  class Osoba(var imie: String, var nazwisko: String) {}

  def greet(person: Osoba): String = {
    person.imie match {
      case "Bartek" => "Hello boss."
      case "Michal" => "Hey bro!"
      case "Piotrek" => "Wassuuuuuuup?"
      case _ => "Hi!"
    }
  }
}
