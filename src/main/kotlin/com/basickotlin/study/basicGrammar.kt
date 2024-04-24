package com.basickotlin.study

class basicGrammar {

    var  a : Int = 0
    var  b : Int = 0
    var  c = "hello world"

    fun method(s : String )  : String {
        val sb : String = StringBuilder(s).append(" hi").toString()
        return sb
    }





}
fun main() {
    var  c = "hello world"
    val basicGrammar = basicGrammar()
    val test = basicGrammar.method(c)
    println(test)
}