open class Person(val name: String = "", var age: Int = 0) {

    fun birthday() {
        println("Happy birthday you were $age")
        age++
        println("You are now $age")
    }

    override fun toString()= "Person($name, $age)"

}

open class Employee(name: String, age: Int, val id: String) : Person(name, age) {

    var rateOfPay: Double = 7.5

    fun calculatePay(hoursWorked: Int): Double {
        return hoursWorked * rateOfPay
    }

    override fun toString()= "Employee($name, $age, $id)"

}

class SalesPerson(name: String,
                  age: Int,
                  id: String,
                  val region: String,
                  val sales: Double) : Employee(name, age, id) {
    fun bonus(): Double {
        return sales * 0.5
    }

    override fun toString()= "SalesPerson($name, $age, $id, $region, $sales)"

}

fun main() {
    val p = Person("Jasmine", 21)
    println("Person - ${p.name} is ${p.age}")
    println("----------------")
    val e = Employee("Adam", 23, "ABC123")
    println("Employee(${e.id}) - ${e.name} is ${e.age}")
    println("----------------")
    val s = SalesPerson("Phoebe", 32, "XYZ987", "South West", 905.55)
    println("SalesPerson(${s.id}) - ${s.name} is ${s.age} for region ${s.region} with ${s.sales} sales")

    println(p)
    println(e)
    println(s)

}