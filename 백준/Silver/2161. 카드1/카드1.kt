
import java.util.LinkedList

fun main(){
    val queue = LinkedList<Int>()
    val list = mutableListOf<Int>()
    readLine()?.let {
        repeat(it.toInt()) {//정수를 입력 받고 큐에 입력 받은 수만 큼 추가
            queue.add(it + 1)
        }
    }
    //사이즈가 1이 될때까지
    //리스트에 큐에 맨 앞에 있는 것을 추가하고
    //이어서 큐에 다음 수를 큐의 맨뒤에 추가
    while (queue.size != 1) {
        list.add(queue.pop())
        queue.addLast(queue.pop())
    }

    list.add(queue.pop())
    print(list.joinToString(" "))
}