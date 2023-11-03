import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt() // 명령어의 수
    val numbers = br.readLine().split(" ").map { it.toInt() }
    val queue: Queue<Int> = LinkedList()
    val stack = Stack<Int>()
    numbers.forEach { number ->
        queue.offer(number)
    }
    var check = 1
    while (queue.isNotEmpty()){
      if(queue.peek()==check){
          queue.poll()
          check++
      }else if(stack.isNotEmpty() && stack.peek()==check){
          stack.pop()
          check++
      }else{
          stack.push(queue.poll())
      }
    }
    while (stack.isNotEmpty()){
        if(stack.peek() == check){
            stack.pop()
            check++
        }else{
            println("Sad")
            return
        }
    }
    println("Nice")
}
