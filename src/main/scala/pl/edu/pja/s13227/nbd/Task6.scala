package pl.edu.pja.s13227.nbd

object Task6 {

  def main(args: Array[String]): Unit = {
    println("---------------------------------------------")
    println("Konto Bankowe:")
    println("---------------------------------------------")

    var kontoBankowe = new KontoBankowe(50)

    kontoBankowe.wplata(100)
    kontoBankowe.wyplata(60)
    println("Stan konta po zaksiegowaniu operacji: " + kontoBankowe.stanKonta)
  }

  class KontoBankowe {

    private var _stanKonta = 0

    def stanKonta: Int = _stanKonta

    def this(initialAmount: Int) {
      this()
      _stanKonta = initialAmount
      println("Stworzono konto z poczatkowa wartoscia: " + _stanKonta)
    }

    def wplata(amount: Int): Unit = {
      _stanKonta += amount
      println("Wplacono " + amount)
    }

    def wyplata(amount: Int): Unit = {
      _stanKonta -= amount
      println("Wyplacono " + amount)
    }
  }
}
