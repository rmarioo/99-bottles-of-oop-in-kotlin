package com.rmarioo.bottle99

class Bottle {


    fun verse(number: Int): String {


        val current     = bottleNumberFor(number)
        val next        = current.successor()


     return "${current.capitalized()} of beer on the wall, " +
             "${current} of beer.\n" +
               current.action() +
             "${next} of beer on the wall.\n"

    }

    private fun bottleNumberFor(number: Int): BottleNumber {
        if (number ==0)
            return BottleNumber0()
        return BottleNumber(number)
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
