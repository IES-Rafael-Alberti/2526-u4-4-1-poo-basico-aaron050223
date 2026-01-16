package ejercicio5

fun main() {
    try {
        val pala = Producto("Nox AT10 18K",148.00,10)
        val pelota = Producto("Pelotas Adidas",-6.00,18)
    } catch (e:IllegalArgumentException) {
        println(e.message)
    }
}