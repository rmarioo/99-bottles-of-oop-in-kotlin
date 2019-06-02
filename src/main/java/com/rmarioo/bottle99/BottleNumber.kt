package com.rmarioo.bottle99

class BottleNumber(val number: Int)
{

    fun quantity(): String {
        if (this.number ==0)
            return "no more"
        return this.number.toString()
    }

    fun container(): String {
        if (this.number ==1)
            return "bottle"
        return "bottles"
    }

    fun action(): String {
        if (this.number ==0)
            return "Go to the store and buy some more, "
        return "Take ${pronoun()} down and pass it around, "
    }

    private fun pronoun(): String {
        if (this.number ==1)
            return "it"
        return "one"
    }

    fun successor(): BottleNumber {
        return if (number ==0)
             BottleNumber(99)
        else BottleNumber(number-1)
    }

    override fun toString(): String {
        return "${quantity()} ${container()}"
    }


}