package ejercicio2

class Vehiculo(private val marca: String, private val modelo: String, private var kilometraje: Double = 0.0) {
    fun registrarViaje(kilometros: Double) {
        kilometraje += kilometros
    }
    fun detalles(): String {return "Marca: $marca, Modelo: $modelo, Kilometraje: $kilometraje"}
}