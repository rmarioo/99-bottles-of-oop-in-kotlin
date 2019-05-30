package com.rmarioo.bottle99

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test

class AcceptanceTest {

    @Ignore("WIP enable this test as a final check")
    @Test
    fun createSong() {

        val text = LoadSong().songToString()

        Assert.assertThat(Bottle().song(),`is`(text))
    }


}