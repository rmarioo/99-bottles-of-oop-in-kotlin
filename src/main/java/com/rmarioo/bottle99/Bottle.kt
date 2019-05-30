package com.rmarioo.bottle99

class Bottle {


    fun verse(number: Int): String {

     return if (number ==0)
             "No more bottles of beer on the wall, no more bottles of beer.\n" +
             "Go to the store and buy some more, 99 bottles of beer on the wall."
         else
         if (number ==1)
             "1 bottle of beer on the wall, 1 bottle of beer.\n" +
             "Take it down and pass it around, no more bottles of beer on the wall.\n"
         else
         if (number ==2)
            "2 bottles of beer on the wall, 2 bottles of beer.\n" +
            "Take one down and pass it around, 1 bottle of beer on the wall.\n"
        else
            "$number bottles of beer on the wall, $number bottles of beer.\n" +
            "Take one down and pass it around, ${number-1} bottles of beer on the wall.\n"

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
