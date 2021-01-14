package com.jjh.props

fun main() {
    val obj = GameObject()
    println("initial obj.x: ${obj.x}, obj.y: ${obj.y}")
    obj.x = 10
    obj.y = 10
    println("updated obj.x: ${obj.x}, obj.y: ${obj.y}")
    println(obj.isHome)
    println(obj.background)
}