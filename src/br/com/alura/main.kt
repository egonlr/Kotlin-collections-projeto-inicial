package br.com.alura

fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.00,
        5 to 150.0,
        6 to 80.0
    )
    //val valorPedido = pedidos.getValue(5)  Gera uma Exception
    //println(valorPedido)
   val mensagem = pedidos.getOrElse(6, { "Não tem o pedido" })
    println(mensagem)
    println(pedidos.getOrDefault(1, -1))
    println(pedidos.getOrDefault(0, -1))

    println(pedidos.keys)
    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados: Map<Int, Double> = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.00
    }
    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
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



