fun main() {
    val n = readLine()!!.toInt()
    var min = readLine()!!.toInt()
    for (i in 2..n) {
        val next = readLine()!!.toInt()
        if (min > next) min = next
    }
    print(min)
}
