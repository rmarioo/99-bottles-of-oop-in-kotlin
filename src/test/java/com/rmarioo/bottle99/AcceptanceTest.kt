package com.rmarioo.bottle99

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert
import org.junit.Test

class AcceptanceTest {

    @Test
    fun createSong() {

        val text = LoadSong().songToString()

        Assert.assertThat(Bottle().song(),`is`(text))
    }


}