import java.io.*
import java.util.*
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`) )
    val n = br.readLine().toInt()
    val list = LinkedList<Int>()
    val sb = StringBuffer()

    repeat(n) {
        val st=StringTokenizer(br.readLine()," ")
        when(st.nextToken()) {
            "push_front" -> {
                list.addFirst(st.nextToken().toInt())
            }
            "push_back" -> {
                list.addLast(st.nextToken().toInt())
            }
            "pop_front" -> {
                sb.append(list.pollFirst() ?: -1).append('\n')
            }
            "pop_back" -> {
                sb.append(list.pollLast() ?: -1).append('\n')
            }
            "size" -> {
                sb.append(list.size).append('\n')
            }
            "empty" -> {
                sb.append(if(list.isEmpty()) 1 else 0).append('\n')
            }
            "front" -> {
                sb.append(list.peekFirst() ?: -1).append('\n')
            }
            "back" -> {
                sb.append(list.peekLast() ?: -1).append('\n')
            }
        }
    }
    println(sb)
}

