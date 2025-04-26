package com.cordova.gianella.laboratoriocalificado_01

fun contarVocales(texto: String): Int {
    // Convertimos el texto a minúsculas y contamos cuántas letras son vocales
    return texto.lowercase().count { it in "aeiou" }
}

fun main() {
    // Solicitar el texto al usuario
    println("Ingresa una frase:")
    val texto = readLine() ?: ""  // Lee el texto

    // Contar las vocales
    val cantidadVocales = contarVocales(texto)
    println("El texto \"$texto\" tiene $cantidadVocales vocales.")
}
