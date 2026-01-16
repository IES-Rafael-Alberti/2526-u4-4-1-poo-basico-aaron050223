package ejercicio3

fun main() {
    try {
        val libro1 = Libro("La Nave de los Colgaos", "Miguel Angel Argüez",false)
        val libro2 = Libro("", "Fernando Macías Grosso", 1234,false)
    } catch (e:IllegalArgumentException) {
        println(e.message)
    }
}