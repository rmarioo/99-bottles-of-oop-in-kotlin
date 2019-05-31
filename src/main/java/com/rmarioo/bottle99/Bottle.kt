package com.rmarioo.bottle99

class Bottle {


    fun verse(number: Int): String {

     return "${quantity(number).capitalize()} ${container(number)} of beer on the wall, " +
            "${quantity(number)} ${container(number)} of beer.\n" +
                    action(number) +
            "${quantity(successor(number))} ${container(successor(number))} of beer on the wall.\n"

    }

    private fun successor(number: Int): Int {
        if (number ==0)
            return 99
        return number - 1
    }

    private fun action(number: Int): String {
        if (number ==0)
            return "Go to the store and buy some more, "
        return "Take ${pronoun(number)} down and pass it around, "
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
      return verses(99,0)
    }

}
