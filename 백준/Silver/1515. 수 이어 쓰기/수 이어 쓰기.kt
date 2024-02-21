class InputHandler {
    val br = System.`in`.bufferedReader()
    fun list(): MutableSet<Int> = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    fun input(): List<String> = br.readLine().split(" ")
    fun brr(): List<Int> = br.readLine().split(' ').map { it.toInt() }
}

fun main() {
    val handler = InputHandler()

    val s = handler.br.readLine()
    var pt = 0

    var base = 0
    while (++base <= 30000) {
        val tmp = base.toString()
        for (i in tmp.indices) {
            if (tmp[i] == s[pt])
                pt++
            if (pt == s.length) {
                println(base)
                return
            }
        }
    }
}