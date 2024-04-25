package com.basickotlin.study

fun main() {
    val box =  Box<Int>(10)
    val box2 =  Box(10)
    val box3 =  Box("test")
}

class Box<T> (value : T){

}