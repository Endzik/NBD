package pl.edu.pja.s13227.nbd

object Task4 {

  val products: Map[String, Double] = Map(
    "Huawei Matebook" -> 2599.0,
    "MacBook Pro" -> 14999.0,
    "Samsung J" -> 749.99,
    "Logitech Wireless Mouse" -> 59.99
  )

  def main(args: Array[String]): Unit = {
    println("---------------------------------------------")
    println("Option na przykladzie mapy:")
    println("---------------------------------------------")

    val huaweiPrice: Option[Double] = products.get("Huawei Matebook")
    println("Huawei Matebook price:")
    println(huaweiPrice.getOrElse("Huawei Matebook price not found!"))

    val iphonePrice: Option[Double] = products.get("IPhone")
    println("IPhone price:")
    println(iphonePrice.getOrElse("IPhone price not found!"))

  }
}
