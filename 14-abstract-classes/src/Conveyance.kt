
abstract class Conveyance {

    protected var fuel = 5.0
    private var running = false

    /**
     * Concrete method that uses consume file
     */
    fun startup() {
        running = true
        consumeFuel()
        while (fuel > 0) {
            consumeFuel()
        }
        running = false
    }

    // Abstract method returning Unit
    abstract fun consumeFuel()

    abstract fun drive(distance: Int): Boolean
}