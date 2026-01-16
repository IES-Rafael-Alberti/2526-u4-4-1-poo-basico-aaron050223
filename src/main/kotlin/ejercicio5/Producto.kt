package ejercicio5

class Producto(private val nombre: String, private val precio: Double, private var stock: Int) {
    init {
        require(stock > 0) {"Stock tiene que ser positivo"}
        require(precio > 0.0) {"Precio tiene que ser positivo"}
    }
    fun vender(cantidad: Int) {
        stock -= cantidad
    }
    fun reabastecer(cantidad: Int) {
        stock += cantidad
    }

    override fun toString(): String {
        return "Producto: $nombre, Precio: $precio€, Stock: $stock"
    }
}