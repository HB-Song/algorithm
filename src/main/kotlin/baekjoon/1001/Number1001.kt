import common.getInputLine

fun solution1001() {
    val line = getInputLine()
    val split = line.split(" ")
    println(split[0].toInt() - split[1].toInt())
}
