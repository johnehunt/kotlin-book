package interfaces

interface Workers {
    fun doWork()
}
interface Employers {
    fun printSelf()
}
interface Records : Workers, Employers, Cloneable {
    fun doSomething()
}