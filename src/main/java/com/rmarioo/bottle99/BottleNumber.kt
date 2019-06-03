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

        val bottleNumbersMap: Map<Int, BottleNumber> =
                mapOf(0 to BottleNumber0(),
                      1 to BottleNumber1(),
                      6 to BottleNumber6())

        fun `for`(number: Int): BottleNumber {

            return bottleNumbersMap.getOrDefault(number, BottleNumber(number))

        }
    }


}