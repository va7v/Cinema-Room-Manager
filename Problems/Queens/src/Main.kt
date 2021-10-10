import java.lang.Math.abs

fun main() {
    var res = false
    val (x1, y1) = readInts()
    val (x2, y2) = readInts()
    res = x1 == x2 || y1 == y2
    val dX = x2 - x1
    val dY = y2 - y1
    res = res || abs(dX) == abs(dY)
    print(if (res) "YES" else "NO")
}
private fun readStrings() = readLine()!!.split(" ") 
private fun readInts() = readStrings().map { it.toInt() }
