fun main() {
    val n = readLine()?.toIntOrNull()
    var users = HashSet<String>()
    var count = 0

    if (n != null) {
        repeat(n) {//n번 반복
            val input = readLine()
            if (input == "ENTER") {  //입장하면 set을 초기화
                users.clear()
            } else if  (input != null) { //enter가 아닌 사람이 들어오면
                if (users.add(input)) { //set에 추가
                    count++  //이모티콘 사용수 추가
                }
            }
        }
    }

    println(count)
}