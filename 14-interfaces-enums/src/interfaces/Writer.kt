package interfaces

interface Writer {
    fun writeSomething()
}

open class Author(val name: String)

class TechnicalAuthor(name: String) : Author(name), Writer, Speaker {
    override fun saySomething() {
        print("hello")
    }

    override fun writeSomething() {
        print("writers block")
    }
}