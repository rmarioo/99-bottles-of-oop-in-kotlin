package com.rmarioo.bottle99

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import java.io.File

class AcceptanceTest {

    @Ignore("WIP enable this test as a final check")
    @Test
    fun createSong() {

        val file: String = ClassLoader.getSystemResource("song.txt").file

        val text = File(file).readText();

        Assert.assertThat(Bottle().song(),`is`(text))
    }
}