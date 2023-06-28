fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val a = input[0]
    val b = input[1]
    val n = input[2]

    var result = a % b

    for(i in 0 until n-1){
        result *= 10
        result %= b
    }

    result *= 10

    println(result / b)
}

