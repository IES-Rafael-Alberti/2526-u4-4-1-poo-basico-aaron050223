package ejercicio1

class CuentaBancaria(private val titular: String, private var saldo: Double = 0.0) {
    fun ingrasar(cantidad: Double = 100.0) {
        saldo += cantidad
        println("Saldo Actual >> $saldo")
    }
    fun retirar(cantidad: Double = 50.0) {
        if (saldo > cantidad) {
            saldo -= cantidad
        } else {
            println("Saldo Insuficiente")
        }
        println("Saldo Actual >> $saldo")

    }
}
