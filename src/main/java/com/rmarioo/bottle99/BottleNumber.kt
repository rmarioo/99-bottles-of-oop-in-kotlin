package com.rmarioo.bottle99

open class BottleNumber(val number: Int) {

    open fun successor() = number-1


    open fun action() = "Take one down and pass it around, "

    open fun quantity() = number.toString()




    open fun container(): String {

        return "bottles"
    }

    override fun toString(): String {
        return "${quantity()} ${container()}"
    }

    fun capitalize(): String {
        return toString().capitalize()
    }


}
