package com.cordova.gianella.laboratoriocalificado_01

fun esAnagrama(palabra1: String, palabra2: String): Boolean {
    // Convertimos ambas palabras a minúsculas, las ordenamos y las comparamos
    val p1 = palabra1.lowercase().toCharArray().sorted()
    val p2 = palabra2.lowercase().toCharArray().sorted()
    return p1 == p2
}

fun main() {

    println("Ingresa la primera palabra:")     // Solicitamos la primera palabra al usuario
    val palabra1 = readLine() ?: ""            // Indicamos que debe leer la primera palabra

    println("Ingresa la segunda palabra:")     //Solictamos la segunda palabra al usuario
    val palabra2 = readLine() ?: ""             // Indicamos que debe leer la primera palabra


    val resultado = esAnagrama(palabra1, palabra2) // Verificar si son anagramas
    if (resultado) {
        println("\"$palabra1\" y \"$palabra2\" Esas palabras si son anagramas :) ") //Si las palbras son anagramas devolvera el mensaje
    } else {
        println("\"$palabra1\" y \"$palabra2\" Esas palabras no son anagramas :(") //Si las palabras no son anagramas devolvera el mensaje
    }
}


