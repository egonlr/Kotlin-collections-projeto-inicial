package br.com.alura

fun main() {
    val assistiramCursoAndroid = listOf<String>("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbas = assistiramCursoAndroid + assistiramCursoKotlin

    println(assistiramAmbas.distinct())

}

