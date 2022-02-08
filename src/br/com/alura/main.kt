package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos){
        println("Numero do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }
    pedidos[4] = 70.0  //inserir novo elemento
    println(pedidos)
    pedidos.put(5, 80.0) //inserir novo elemen
    println(pedidos)
    pedidos[1] = 100.0  //atualizar
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0) //se existe não autaliza
    println(pedidos)
    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3, 50.0) // remove se o valor for 50.0
    println(pedidos)

}



