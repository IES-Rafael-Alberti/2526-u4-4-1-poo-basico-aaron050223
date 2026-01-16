package ejercicio3

class Libro(private val titulo: String, private val autor: String, private var leido: Boolean = false) {
    init {
        require(titulo.isNotBlank()) {"Ponle nombre al libro chaval"}
    }
    private var numPaginas: Int = 100
        set(value) {
            field = when {
                value > 5000 -> 5000
                value < 0 -> 0
                else -> value
            }
        }
    constructor(titulo: String, autor: String, numPaginas: Int, leido: Boolean) : this(titulo, autor, leido) {
        this.numPaginas = numPaginas
    }
    override fun toString(): String {
        return "Libro $titulo por $autor, Páginas: $numPaginas, Leido: ${if (leido) "Sí" else "No"}"
    }
}