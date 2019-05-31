package com.rmarioo.bottle99

class Bottle {


    fun verse(number: Int): String {

     return if (number ==0)
             "No more bottles of beer on the wall, " +
             "no more bottles of beer.\n" +
             "Go to the store and buy some more, " +
             "99 bottles of beer on the wall."
         else
            "$number ${container(number)} of beer on the wall, " +
            "$number ${container(number)} of beer.\n" +
            "Take ${pronoun(number)} down and pass it around, " +
            "${quantity(number-1)} ${container(number-1)} of beer on the wall.\n"

    }

    private fun quantity(number: Int): String {
        if (number ==0)
            return "no more"
        return number.toString()
    }

    private fun pronoun(number: Int =1): String {
        if (number ==1)
            return "it"
        return "one"
    }


    private fun container(number: Int =1): String {
        if (number ==1)
            return "bottle"
        return "bottles"
    }


    fun verses(start: Int ,end: Int): String
    {
       return (start downTo end).map(this::verse).joinToString(separator = "\n")
    }

    fun song(): String
    {
      return verses(99,0) + "\n"
    }

}
