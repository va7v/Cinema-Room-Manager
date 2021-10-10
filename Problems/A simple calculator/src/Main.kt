fun main() {
    val input = readLine()!!
    var a = ""
    var opPos = 0
    for (i in input.indices) {
        if (input[i] != ' ') a += input[i] else {
            opPos = i + 1
            break
        }
    }
    val numA = a.toLong()
    val numB = input.drop(opPos + 2).toLong()
    when (input[opPos]) {
        '-' -> print(numA - numB)
        '+' -> print(numA + numB)
        '*' -> print(numA * numB)
        '/' -> if (numB != 0L) print(numA / numB) else print("Division by 0!")
        else -> print("Unknown operator")
    }
}
