package com.rmarioo.bottle99


open class BottleNumber(val number: Int)
   {

    open fun quantity(): String {
        return this.number.toString()
    }

    fun container(): String {
        if (this.number ==1)
            return "bottle"
        return "bottles"
    }

    override fun toString(): String {
        return "${quantity()} ${container()}"
    }

    fun capitalized(): String {
        return this.toString().capitalize();
    }


    open fun action(): String {
        return "Take ${pronoun()} down and pass it around, "
    }

    private fun pronoun(): String {
        if (this.number ==1)
            return "it"
        return "one"
    }


   }