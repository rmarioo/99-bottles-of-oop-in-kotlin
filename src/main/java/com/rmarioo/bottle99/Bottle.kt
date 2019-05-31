package com.rmarioo.bottle99

class Bottle {


    fun verse(number: Int): String {

        val bottleNumber     = BottleNumber(number)
        val nextBottleNumber = bottleNumber.successor()


     return "${bottleNumber.capitalizedQuantity()} ${bottleNumber.container()} of beer on" +
             " the wall, " +
            "${bottleNumber.quantity()} ${bottleNumber.container()} of beer.\n" +
             bottleNumber.action() +
            "${nextBottleNumber.quantity()} ${nextBottleNumber.container()} of beer on the wall.\n"

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
