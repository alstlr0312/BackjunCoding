    import java.util.StringTokenizer
    import kotlin.math.roundToInt

    fun main() = with(System.out.bufferedWriter()){
        val br = System.`in`.bufferedReader()
        val n = br.readLine().toInt()
        val numberList = mutableListOf<Int>()
        repeat(n) {
            numberList.add(br.readLine().toInt())
        }
        write("${getAverage(numberList)}\n")
        write("${getMid(numberList)}\n")
        write("${getFreq(numberList)}\n")
        write("${getRange(numberList)}\n")
        flush()
    }

    fun getAverage(numberList: MutableList<Int>): Int {
        return numberList.average().roundToInt()
    }

    fun getMid(numberList: MutableList<Int>): Int {
        val sort = numberList.sorted()
        val mid = numberList.size/2
        return sort[mid]
    }

    fun getFreq(numberList: MutableList<Int>): Int {
        val freq = numberList.groupingBy { it }.eachCount()
        val maxValue = freq.maxOf { it.value }
        val maxFreqMap = freq.filter { it.value == maxValue }
        val mapKeys = maxFreqMap.keys.sorted()
        return if (mapKeys.size == 1) {
            mapKeys.first()
        } else {
            mapKeys[1]
        }
    }

    fun getRange(numberList: MutableList<Int>): Int {
        val max = numberList.maxOf { it }
        val min = numberList.minOf { it }
        return max - min
    }


