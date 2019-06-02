package com.rmarioo.bottle99

open class BottleNumber(val number: Int)
{

    open fun quantity()  = this.number.toString()

    open fun container() = "bottles"

    open fun action()    = "Take one down and pass it around, "

    override fun toString() = "${quantity()} ${container()}"


}