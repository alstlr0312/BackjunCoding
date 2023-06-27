fun main() {
    val s: Map<String, Double> = mapOf(
            "A+" to 4.5,
            "A0" to 4.0,
            "B+" to 3.5,
            "B0" to 3.0,
            "C+" to 2.5,
            "C0" to 2.0,
            "D+" to 1.5,
            "D0" to 1.0,
            "F" to 0.0,
    )

    var result: Double = 0.0
    var resultScore: Double = 0.0

    for(i in 0 until 20) {
        val n: String = readLine()!!
        val m = n.split(" ")
        val credit: Double = m[1].toDouble()
        val grade: String = m[2]

        if(grade.equals("P")) continue
        result += s.get(grade)!! * credit
        resultScore += credit
    }

    print(result / resultScore)
}