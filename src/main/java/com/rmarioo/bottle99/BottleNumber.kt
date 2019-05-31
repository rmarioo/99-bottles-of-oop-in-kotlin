package com.rmarioo.bottle99


open class BottleNumber(val number: Int) {

    open fun quantity() = this.number.toString()

    open fun container(): String = "bottles"

    override fun toString(): String = "${quantity()} ${container()}"

    fun capitalized(): String = this.toString().capitalize()

    open fun successor(): BottleNumber {
        return BottleNumber.`for`(number - 1)
    }

    open fun action(): String = "Take one down and pass it around, "


    companion object {
        fun `for`(number: Int): BottleNumber {
            if (number == 0)
                return BottleNumber0()
            if (number == 1)
                return BottleNumber1()
            if (number == 6)
                return BottleNumber6()
            return BottleNumber(number)
        }
    }


}