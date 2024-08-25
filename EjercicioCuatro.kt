/*Crea un programa que permita al usuario ingresar 4 números enteros y los
almacene en un array. Luego, encuentra y muestra el número mayor del array. Usa trycatch para manejar entradas no numéricas. */

fun main() {
    val numeros = Array(4) { 0 }

    for (i in numeros.indices) {
        while (true) {
            try {
                print("Ingresa un número entero (${i + 1}/4): ")
                numeros[i] = readLine()!!.toInt()
                break
            } catch (e: NumberFormatException) {
                println("Error: Debes ingresar un número entero válido.")
            }
        }
    }

    val maxNumero = numeros.maxOrNull() ?: 0
    println("El número mayor del array es: $maxNumero")
}
