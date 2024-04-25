package com.basickotlin.study

class TypeCheck {


    /**
     * 타입을 체크할 때는 is 를 사용해라
     */

}

fun main(){
    val cat = Cat()
    val dog : Animal = Dog()
    if( dog is Dog){

        println("dog is Dog")
    }

    if( cat is Cat){
        println("cat is Cat")
    }

    if (dog is Cat){
        println("dog is Cat")
    }else{
        println("dog is not  Cat")
    }
}