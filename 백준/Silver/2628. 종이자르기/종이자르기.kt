import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (x,y) = br.readLine().trim().split(' ').map { it.toInt() }
    val yArr = ArrayList<Int>() //y좌표 리스트
    val xArr = ArrayList<Int>() //x좌표 리스트
    yArr.add(y)
    xArr.add(x)
    yArr.add(0)
    xArr.add(0)
    repeat(br.readLine().trim().toInt()){
        val(order,num) = br.readLine().trim().split(' ').map { it.toInt() }
        if(order==0){
            yArr.add(num)
        }else{
            xArr.add(num)
        }
    }
    yArr.sort()
    xArr.sort()
    var maxy = 0
    var maxx = 0
    //y축간의 차이가 제일 큰 것을 maxy에 저장
    for(i in 1 until yArr.size){
        maxy = maxy.coerceAtLeast(yArr[i]-yArr[i-1])
    }
    for(i in 1 until xArr.size){
        maxx = maxx.coerceAtLeast(xArr[i]-xArr[i-1])
    }
    //x축간의 차이가 제일 큰 것을 maxx에 저장
    //넓이 출력
    bw.write("${maxy * maxx}")
    bw.flush()
}