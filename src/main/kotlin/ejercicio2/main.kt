package ejercicio2

fun main() {
    val citroen = Vehiculo("Citroen", "Picasso")
    citroen.registrarViaje(100.0)
    println(citroen.detalles())
}