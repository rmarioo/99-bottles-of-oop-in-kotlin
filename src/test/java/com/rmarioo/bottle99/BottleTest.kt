package com.rmarioo.bottle99

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert
import org.junit.Assert.assertThat
import org.junit.Test

class BottleTest
{

    @Test
    fun `first verse`() {

        val result: String = Bottle().verse(99)
        assertThat(result,`is`(
                "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall.\n"
        ))
    }

    @Test
    fun `another verse`() {

        val result = Bottle().verse(3)
        assertThat(result,`is`(
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                        "Take one down and pass it around, 2 bottles of beer on the wall.\n"))
    }

    @Test
    fun `verse 2`() {

        val result = Bottle().verse(2)
        assertThat(result,`is`(
                "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                        "Take one down and pass it around, 1 bottle of beer on the wall.\n"))
    }

    @Test
    fun `verse 1`() {
        val result = Bottle().verse(1)
        assertThat(result,`is`(
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take it down and pass it around, no more bottles of beer on the wall.\n"))
    }

    @Test
    fun `verse 0`() {
        val result = Bottle().verse(0)
        assertThat(result,`is`(
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall."))
    }

    @Test
    fun multipleVerses() {

        val verses = Bottle().verses(1, 0)

        Assert.assertThat(verses,`is`(
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take it down and pass it around, no more bottles of beer on the wall.\n" +
                "\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall."
        ));
    }


     @Test
    fun fullSong() {

        val text = LoadSong().songToString()

      assertThat(Bottle().song(),`is`(text))
    }
}