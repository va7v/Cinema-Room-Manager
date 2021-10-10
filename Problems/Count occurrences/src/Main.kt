fun main() {
    val n = readLine()!!.toInt()
    val theList = mutableListOf<Int>()
    for (i in 0..n - 1) theList.add(readLine()!!.toInt())
    val m = readLine()!!.toInt()
    var cnt = 0
    for (i in 0..n - 1) if (theList[i] == m) cnt++
    print(cnt)
}