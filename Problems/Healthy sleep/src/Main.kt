fun main() {    
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val H = readLine()!!.toInt()
    if (H < A) println("Deficiency")
    else if (H > B) println("Excess")
        else println("Normal")
    println()
}
