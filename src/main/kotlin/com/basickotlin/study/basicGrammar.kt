package com.basickotlin.study

import kotlin.math.max
import kotlin.random.Random

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
    print(c[0])
    println(c[1])

    var i =  Random.nextInt(1, 20)
    var j =  Random.nextInt(1, 20)
    println(max(i,j))



    if(i >= j){
        println("test i = $i")
    }else{
        println("test j = $j")
    }

    var items = listOf(1,2,3,4,5)

    for (item in items){
        println(item)
    }

    items.forEach { i ->  println(i) }

    for(i in 0..<items.size){
        println(items[i])
    }

    val mutableListOf = mutableListOf(1, 4, 23, 5, 6, 23, 5, 6, 2, 4,"ji")

    mutableListOf.add(123)
    mutableListOf.add("test")

    mutableListOf.forEach { i -> println(i) }

    val arrayOf = arrayOf(1, 3, 4, 532, 2)
    println(arrayOf[1])

    var hi: String? = null
    var kkk : String? = null
    kkk = "study hard kotlin"

    kkk?.let{
        hi = kkk + " go to good company"
    }
    println(hi)
    print(sum(1,2,4))
    println(sum(1,2))
    println(sum(a= 1,b= 2,c= 4))
    println(sum(b= 2,c= 4, a= 1))

    val person = Person("test", 123, "change")
    println("Before = "+person.changeValue)
    person.changeValue = "hi im change"
    println(person.age)
    println(person.name)
    println("After = " + person.changeValue)
    println("person = $person")
    val difPerson = Person("test1", 123, "change")
    val samePerson = Person("test", 123, "hi im change")
    println("person == difPerson : " + (person == difPerson))
    println("person == samePerson : " + (person == samePerson))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Int, b: Int , c: Int = 0) : Int{
    return a+b+c
}

data class Person(val name: String,
             val age: Int,
    var changeValue: String ){


}

