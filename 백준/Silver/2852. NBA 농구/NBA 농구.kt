import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*


val br = System.`in`.bufferedReader()

fun list() = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
fun input() = br.readLine().split(" ")
fun brr() = br.readLine().split(' ').map { it.toInt() }

fun main() {
    val n = br.readLine().toInt()
    var team1win = 0 // 1번 팀이 이기는 시간
    var team2win = 0
    var point = 0
    //일차원 배열로 생각
    //1 1 2 2 2 이렇게 골을 넣었으면 
    //point는 1 2 1 0 -1 이렇게 됨. 즉 양수는 1팀이 이기는 경우 음수는 2팀 0은 비길떄
    repeat(n) {
        val (team, time) = br.readLine().split(" ")
        val (m, s) = time.split(":").map { it.toInt() }

        if (team == "1") {
            if (point == 0) {//1팀이 지금부터 이기는 시간
                team1win += 48 * 60 - (60 * m + s)
            }
            point += 1
            if (point == 0) { //넣고 0점이 되면 비기기 시작 
                if (team2win > 0) {
                    team2win -= 48 * 60 - (60 * m + s)
                }
            }
        } else {
            if (point == 0) { //2팀이 지금부터 이기는 시간
                team2win += 48 * 60 - (60 * m + s)
            }
            point -= 1
            if (point == 0) { //넣고 0점이 되면 비기기 시작 
                if (team1win > 0) {
                    team1win -= 48 * 60 - (60 * m + s)
                }
            }
        }
    }

    println("${"%02d".format(team1win / 60)}:${"%02d".format(team1win % 60)}")
    println("${"%02d".format(team2win / 60)}:${"%02d".format(team2win % 60)}")
}