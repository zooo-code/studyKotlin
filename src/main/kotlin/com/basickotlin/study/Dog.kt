package com.basickotlin.study


abstract class Animal {

    fun eat(){
        println("Animal eat")
    }
    open fun run(){
        println("Animal run")
    }
}


class Dog : Animal(),  Drawable, Make {

    fun move(){
        println("dog.move")
    }
    override fun run(){
        println("dog.run")
    }

    override fun draw() {
        TODO("Not yet implemented")
    }

    override fun make() {
        TODO("Not yet implemented")
    }

}

class Cat : Animal(), Drawable, Make{

    fun move(){

    }

    override fun draw() {
        TODO("Not yet implemented")
    }

    override fun make() {
        TODO("Not yet implemented")
    }
}

// open 을 넣어야 상속
open class Father{

}

class Son : Father()


