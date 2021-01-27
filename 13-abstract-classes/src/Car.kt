
class Car : Conveyance() {

    override fun consumeFuel() {
        fuel -= 1.0
        println("consuming, ")
    }

    override fun drive(distance: Int): Boolean {
        println("Driven $distance")
        return true
    }
}