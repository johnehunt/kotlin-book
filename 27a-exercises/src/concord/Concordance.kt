package concord

fun main() {
    val concordMap = mutableMapOf<String, Pair<String, Int>>()
    print("Please enter text to be analysed: ")
    val input = readLine() ?: ""
    val strings = input.split(" ")
    strings.forEach{
        if (concordMap[it] == null) {
            val pair = Pair(it, 1)
            concordMap[it] = pair
        } else {
            val originalPair = concordMap[it]
            val newPair = originalPair?.copy(second = originalPair.second + 1)
            concordMap[it] = newPair!!
        }
    }
    concordMap.values.forEach{println(it)}
}