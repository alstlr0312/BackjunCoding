import java.util.*
import kotlin.system.exitProcess

fun main() {
    val input = Scanner(System.`in`)
    val N = input.nextInt()
    var Z = input.nextInt()
    val M = input.nextInt()
    val obs = mutableSetOf<Int>()
    repeat(M) {
        obs.add(input.nextInt())
    }
    
    if (Z == N) {
        Z = 0
    }
    
    for (K in 1 until N) {
        val arr = mutableListOf<Int>()
        for (x in 0 until N) {
            arr.add((1 + K * x) % N)
        }
        
        for (value in arr) {
            if (value in obs) {
                break
            }
            
            if (value == Z) {
                println(K)
                exitProcess(0)
            }
        }
    }
}
