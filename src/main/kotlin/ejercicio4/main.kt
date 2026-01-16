package ejercicio4

fun main() {
    val estudiante1 = Estudiante("A",-1.0)
    val estudiante2 = Estudiante("B",2.0)
    val estudiante3 = Estudiante("C",8.0)
    val estudiante4 = Estudiante("D",11.0)
    val estudiantes = listOf(estudiante1,estudiante2,estudiante3,estudiante4)
    for (estudiantes in estudiantes) {
        println(estudiantes)
    }
}