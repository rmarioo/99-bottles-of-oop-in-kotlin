package com.rmarioo.bottle99

open class BottleNumber(val number: Int)
{

    open fun quantity()  = this.number.toString()

    open fun container() = "bottles"

    open fun action()    = "Take one down and pass it around, "

    override fun toString() = "${quantity()} ${container()}"

    fun capitalize() = toString().capitalize()

    fun successor(): BottleNumber{
        return numberFor(successor(this.number))
    }

    private fun successor(number: Int): Int {
        return if (number== 0) 99 else number-1
    }

    companion object {
         fun numberFor(number: Int): BottleNumber {
            return if (number == 0) ZeroBottle()
            else if (number == 1) OneBottle()
            else if (number == 6) SixPacks()
            else BottleNumber(number)
        }
    }

}