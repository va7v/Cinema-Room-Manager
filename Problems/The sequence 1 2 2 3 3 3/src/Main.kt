fun main() {        
    val input = readLine()!!.toInt()
    var curNum = 1
    var totalCnt = 1
    do {        
        var intCnt = 1
        while (intCnt <= curNum && totalCnt <= input) {
            print("$curNum ")
            intCnt++
            totalCnt++
        }                
        curNum++
    } while (totalCnt <= input)    
}
