package com.cordova.gianella.laboratoriocalificado_01

fun esAnagrama(palabra1: String, palabra2: String): Boolean {
    // Convertimos ambas palabras a minúsculas, las ordenamos y las comparamos
    val p1 = palabra1.lowercase().toCharArray().sorted()
    val p2 = palabra2.lowercase().toCharArray().sorted()
    return p1 == p2
}

fun main() {
    // Solicitar las palabras al usuario
    println("Ingresa la primera palabra:")
    val palabra1 = readLine() ?: ""  // Lee la primera palabra

    println("Ingresa la segunda palabra:")
    val palabra2 = readLine() ?: ""  // Lee la segunda palabra

    // Verificar si son anagramas
    val resultado = esAnagrama(palabra1, palabra2)
    if (resultado) {
        println("\"$palabra1\" y \"$palabra2\" son anagramas.")
    } else {
        println("\"$palabra1\" y \"$palabra2\" no son anagramas.")
    }
}
