package br.com.alura

fun testaSet() {
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
    //val assistiramAmbos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)
    println("União: ${assistiramCursoAndroid union assistiramCursoKotlin}")
    println("Subtração: ${assistiramCursoAndroid subtract assistiramCursoKotlin}")
    println("Interceção: ${assistiramCursoAndroid intersect assistiramCursoKotlin}")

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet()) // não repete os elementos
}