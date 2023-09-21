import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.time.LocalDate

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val file = mutableMapOf<String, Int>()

    repeat(br.readLine().toInt()) {
        val extension = br.readLine().split(".")[1] //확장자 확인

        if(file.containsKey(extension)){//확장자가 존재하면 ++
            file[extension] = file[extension]!!+1
        }else{//없다면 확장자 추가
            file.put(extension,1)
        }
    }
    //확장자명과 개수 출력
    file.toSortedMap().forEach{
        bw.write("${it.key} ${it.value}\n")
        bw.flush()
    }

}