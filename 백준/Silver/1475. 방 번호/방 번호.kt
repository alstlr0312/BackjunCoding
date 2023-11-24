val br = System.`in`.bufferedReader()
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() = with(System.out.bufferedWriter()){
    val n = br.readLine()
    val remain = IntArray(10){0}
    val sixnine = IntArray(2){0}
    for(w in n){
        if(w=='6'){
            sixnine[0]+=1
        }
        else if(w=='9'){
            sixnine[1]+=1
        }
        else{
            remain[w-'0']+=1
        }
    }
    val sum = sixnine[0]+sixnine[1]
    var a = 0
    if(sum%2==1){
        a = (sum/2)+1
    }
    else{
        a = (sum/2)
    }
    remain.sort()
    val b = remain[9]
    if(a>b){
        write("$a\n")
    }
    else{
        write("$b\n")
    }
    close()
}

