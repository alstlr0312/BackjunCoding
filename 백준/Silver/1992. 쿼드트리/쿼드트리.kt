import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = Integer.parseInt(br.readLine())
    val img = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        val str = br.readLine()
        for (j in 0 until n) {
            img[i][j] = str[j].toInt() - '0'.toInt()
        }
    }

    val sb = StringBuilder()
    quadTree(img, 0, 0, n, sb)
    println(sb)
}

fun quadTree(img: Array<IntArray>, x: Int, y: Int, size: Int, sb: StringBuilder) {
    if (isPossible(img, x, y, size)) {
        sb.append(img[x][y])
        return
    }
    val newSize = size / 2
    sb.append('(')
    quadTree(img, x, y , newSize ,sb)
    quadTree(img,x ,y + newSize,newSize,sb)
    quadTree(img,x + newSize,y,newSize,sb)
    quadTree(img,x + newSize,y + newSize,newSize,sb)
    sb.append(')')
}

fun isPossible(img: Array<IntArray>, x: Int, y: Int,size:Int): Boolean{
    val value = img[x][y]
    for(i in x until x+size){
        for(j in y until y+size){
            if(value != img[i][j]){
                return false
            }
        }
    }
    return true
}
