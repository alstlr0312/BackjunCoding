import java.util.*

lateinit var temp: IntArray
    var count = 0
    var K = 0
    var result = -1
    fun main() = with(System.out.bufferedWriter()){
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        K = sc.nextInt()
        val arr = IntArray(n)
        temp = IntArray(n)
        for (i in 0 until n) {
            arr[i] = sc.nextInt()
        }
        sc.close()

        mergeSort(arr, 0, arr.size - 1)
        write("$result")
        flush()
    }

 fun mergeSort(A: IntArray, low: Int, high: Int) {
     if (low < high) {
         val mid = (low + high) / 2
         mergeSort(A, low, mid)
         mergeSort(A, mid + 1, high)
         merge(A, low, mid, high)
     }
 }

 fun merge(A: IntArray, low: Int, mid: Int, high: Int) {
     var i = low
     var j = mid + 1
     var t = 0

     while (i <= mid && j <= high) {
         if (A[i] <= A[j]) {
             temp[t++] = A[i++]
         } else {
             temp[t++] = A[j++]
         }
     }

     while (i <= mid) {
         temp[t++] = A[i++]
     }

     while (j <= high) {
         temp[t++] = A[j++]
     }

     t = 0
     i = low

     while (i <= high) {
         count++
         if (count == K) {
             result = temp[t]
             break
         }
         A[i++] = temp[t++]
     }
 }