package interfaces

interface Workers {
    fun doWork()
}
interface Employers: Cloneable {
    fun printSelf()
}
interface Records : Workers, Employers {
    fun doSomething()
}