package com.rmarioo.bottle99

class BottleNumber(val number: Int)
{

    fun capitalizedQuantity(): String {
        return quantity().capitalize()
    }
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
        if (number ==0)
            return BottleNumber(99)
        return BottleNumber(number-1)
    }
}