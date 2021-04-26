package com.jjh.props

/**
 * Illustrates use of properties and their types:
 * <visibility> [modifiers] val propertyName: PropertyType = initial_value
 * <visibility> [modifiers] var propertyName: PropertyType = initial_value
 */
class GamePlayer(firstName: String,  // constructor param
                 surname: String,    // constructor param
                 var age: Int,       // read write property
                 val id: String,     // readonly property
                 private val message: String = "Happy Birthday" // private property
) {

    val fullname: String = "$firstName $surname"  // read only property initialised in init block
    var favouriteGame: String = "" // read write property

//    init {
//        // firstName and surname only visible in init
//        fullname = "$firstName $surname"
//        favouriteGame = ""
//    }

    override fun toString(): String {
        return "GamePlayer[$fullname, $age]"
    }

    fun birthday() {
        val oldAge = age
        age++
        println("$message $fullname, you were $oldAge you are now $age")
    }

}