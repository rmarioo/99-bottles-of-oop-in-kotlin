package com.rmarioo.bottle99

class Bottle {


    fun verse(number: Int): String {

         val current     = BottleNumber.`for`(number)

     return "${current.capitalized()} of beer on the wall, " +
             "${current} of beer.\n" +
               current.action() +
             "${current.successor()} of beer on the wall.\n"

    }

    private fun successor(number: Int): Int {
        if (number == 0)
            return 99
        return number -1
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
