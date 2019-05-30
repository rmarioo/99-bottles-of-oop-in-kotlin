package com.rmarioo.bottle99

class Bottle {


    fun verse(n: Int): String
    {
       return "${ if (n == 0)  "No more" else n} bottle${ if (n != 1) "s" else "" }" + " of beer on the wall, " +
        "${ if (n == 0)  "no more" else n} bottle${ if (n != 1) "s" else ""} of beer.\n" +
        "${ if (n > 0)  "Take ${if (n > 1) "one" else "it"} down and pass it around"
            else "Go to the store and buy some more"}, " +
        "${if ((n-1) < 0)  99 else if ((n-1) == 0) "no more" else n-1} " +
                "bottle${if (n-1 != 1) "s" else ""} of beer on the wall.\n"
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
