import java.util.StringTokenizer

fun main() = with(System.out.bufferedWriter()){
    val br = System.`in`.bufferedReader()

    var n = br.readLine().toInt()

    var st : StringTokenizer
    var user1: String
    var user2: String

    val enterUser = HashSet<String>()
    enterUser.add("ChongChong")

    for(i in 0 until n){
        st = StringTokenizer(br.readLine())
        user1 = st.nextToken()
        user2 = st.nextToken()
        if (enterUser.contains(user1) || enterUser.contains(user2)) {
            enterUser.add(user1)
            enterUser.add(user2)
        }
    }
    write("${enterUser.size}")
    flush()

}