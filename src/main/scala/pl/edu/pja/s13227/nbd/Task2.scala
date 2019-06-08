package pl.edu.pja.s13227.nbd

object Task2 {

  val products: Map[String, Double] = Map(
    "Huawei Matebook" -> 2599.0,
    "MacBook Pro" -> 14999.0,
    "Samsung J" -> 749.99,
    "Logitech Wireless Mouse" -> 59.99
  )

  def main(args: Array[String]): Unit = {
    println("---------------------------------------------")
    println("Mapa produktow:")
    println("---------------------------------------------")

    println(products)

    println("---------------------------------------------")
    println("Mapa produktow ze znizka:")
    println("---------------------------------------------")

    val discountProducts = products.mapValues(price => 0.9 * price)
    println(discountProducts)
  }
}
