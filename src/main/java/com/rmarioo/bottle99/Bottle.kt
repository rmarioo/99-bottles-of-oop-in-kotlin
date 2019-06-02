package com.rmarioo.bottle99

class Bottle {


    fun verse(number: Int): String {

        val current     = numberFor(number)
        val next        = numberFor(successor(number))


     return "${"$current".capitalize()} of beer on the wall, " +
             "${current} of beer.\n" +
               current.action() +
             "${next} of beer on the wall.\n"

    }

    private fun numberFor(number: Int): BottleNumber {
        return if (number == 0) ZeroBottle()
        else if (number == 1) OneBottle()
        else BottleNumber(number)
    }


    private fun successor(number: Int): Int {
       return if (number== 0) 99 else number-1
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
