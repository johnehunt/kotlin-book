fun main() {
    var nonNullableVar = "abc" // Standard variable - cannot be set to null
    println("nonNullableVar: $nonNullableVar")
    // nonNullableVar = null // Compilation error - ull can not be a value of a non-null type String

    var nullableVar: String? = "abc" // Nullable variable - can be set to null
    println("nullableVar: $nullableVar")
    nullableVar = null
    println("nullableVar now: $nullableVar")

    val l1 = if (nullableVar == null) -1 else nullableVar.length
    println("l1: $l1")

    println("---------------")

    nullableVar = "John"
    println(nullableVar?.length)

    nullableVar = null
    println(nullableVar?.length)

    nullableVar = "John"
    val l2 = nullableVar?.length ?: -1
    println(l2)

    nullableVar = null
    val l3 = nullableVar?.length ?: -1
    println(l3)

    nullableVar = "John"
    val l4 = nullableVar!!.length
    println(l2)

//    nullableVar = null
//    val l5 = nullableVar!!.length
//    println(l3)

    val total: Int? = null
    println(total as? Int)

}