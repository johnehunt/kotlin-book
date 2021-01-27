package com.jjh.props

class Location

class GameObject {
    var x = 0
        get() = field // implicit backing field generated for you
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var y: Int = 0
        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    // Doesn't use a backing field but looks like a property
    val isHome: Boolean
        get() {
            return false
        }

    // Can explicitly specify own backing field
    private var _background: String? = null
    var background: String?
        get() {
            if (_background == null) {
                _background = "blue"
            }
            return _background
        }
        set(value) {_background = value }

    // Appears as a val outside the class
    // but internally can be set
    var location: Location = Location()
        private set

}