package com.rmarioo.bottle99

class Bottle {


    fun verse(number: Int): String {

        val bottleNumber = nomberFor(number)
        val next         = nomberFor(bottleNumber.successor())


        return "${bottleNumber.capitalize()} of beer on the wall, " +
               "${bottleNumber} of beer.\n" +
                  bottleNumber.action() +
                "${next} of beer on the wall.\n"

    }

    private fun nomberFor(number: Int): BottleNumber {
        if (number ==0)
            return ZeroBottleNumber()
        if (number ==1)
            return OneBottleNumber()

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
