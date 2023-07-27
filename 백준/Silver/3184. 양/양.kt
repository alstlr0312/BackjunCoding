import java.io.*
import java.util.*

var h = 0
var w = 0
lateinit var map: Array<CharArray>
lateinit var visited: Array<BooleanArray>
var move = arrayOf(intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, -1))
var sheep = 0
var wolf = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    var resultS = 0
    var resultW = 0

    val st = StringTokenizer(br.readLine())
    h = st.nextToken().toInt()
    w = st.nextToken().toInt()

    //뒷마당 생성
    map = Array(h) { CharArray(w) }
    //뒷마당 구역마다 방문했는지 확인하기 위해 생성
    visited = Array(h) { BooleanArray(w) }

    //뒷마당 상황 입력 받음
    for (x in 0 until h) {
        map[x] = br.readLine().toCharArray()
    }

    //뒷마당을 방문해보며 만일 방문하지 않았고 양 또는 늑대가 나타나면 dfs 시작
    for (x in 0 until h) {
        for (y in 0 until w) {
            if (!visited[x][y] && (map[x][y] == 'o' || map[x][y] == 'v')) {
                sheep = 0
                wolf = 0
                dfs(x, y)
                //dfs 탐색을 하고 울타리 안에 양이 많은지 늑대가 많은지 확인하고 결과 입력
                if (sheep > wolf)
                    resultS += sheep
                else
                    resultW += wolf
            }
        }
    }

    sb.append(resultS).append(" ").append(resultW)

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun dfs(x: Int, y: Int) {
    //방문 했기에 true로 변경
    visited[x][y] = true
    // 양 또는 늑대면 ++
    if (map[x][y] == 'v')
        wolf++
    if (map[x][y] == 'o')
        sheep++
    var nextX: Int
    var nextY: Int

    for (i in 0..3) {
        //해당 지점을 기준으로 상하좌우로 이동함
        nextX = x + move[i][0]
        nextY = y + move[i][1]

        //만일 정원을 나가거나 방문을 했거나 울타이를 만나면 그만 이동
        if (nextX < 0 || nextY < 0 || nextX >= h || nextY >= w || visited[nextX][nextY] || map[nextX][nextY] == '#')
        {
            continue
        }
        //위의 조건에 해당 되지 않았으면 이동했던 지점에 대해 방문 여부를 체크함
        visited[nextX][nextY] = true
        dfs(nextX, nextY)
    }
}
