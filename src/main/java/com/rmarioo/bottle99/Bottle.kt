package com.rmarioo.bottle99

class Bottle {


    fun verse(number: Int): String {

        val current     = BottleNumber(number)
        val next        = current.successor()


     return "${current.capitalized()} of beer on the wall, " +
             "${current} of beer.\n" +
               current.action() +
             "${next} of beer on the wall.\n"

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
