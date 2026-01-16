package ejercicio4

class Estudiante(val nombre: String) {
    private var nota: Double = 0.0
        set(value) {
            field = when {
                value > 10.0 -> 10.0
                value < 0.0 -> 0.0
                else -> value
            }
        }
    constructor(nombre: String, nota: Double) : this(nombre) {
        this.nota = nota
    }
    override fun toString(): String {
        return "Estudiante: $nombre, Nota: $nota"
    }
}
