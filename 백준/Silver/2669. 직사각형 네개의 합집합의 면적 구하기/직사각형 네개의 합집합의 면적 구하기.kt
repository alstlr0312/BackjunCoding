fun main() {
    val xy = Array(101) { IntArray(100) }
    var result = 0
    repeat(4) {
        val (i, j, x, y) = readLine()!!.split(" ").map { it.toInt() }

        for (a in i until x) {
            for (b in j until y) {
                if (xy[a][b] == 0) {
                    xy[a][b] += 1
                    result += 1
                }
            }
        }
    }
    println(result)
}