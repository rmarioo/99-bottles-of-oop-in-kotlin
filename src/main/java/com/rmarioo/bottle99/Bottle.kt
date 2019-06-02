package com.rmarioo.bottle99

import com.rmarioo.bottle99.BottleNumber.Companion.numberFor

class Bottle {


    fun verse(number: Int): String {

        val bottleNumber = numberFor(number)

        return "${bottleNumber.capitalize()} of beer on the wall, " +
                "${bottleNumber} of beer.\n" +
                   bottleNumber.action() +
                "${bottleNumber.successor()} of beer on the wall.\n"

    }

    fun verses(start: Int ,end: Int): String
    {
       return (start downTo end).map(this::verse).joinToString(separator = "\n")
    }

    fun song(): String
    {
      return verses(99,0)
    }

}
