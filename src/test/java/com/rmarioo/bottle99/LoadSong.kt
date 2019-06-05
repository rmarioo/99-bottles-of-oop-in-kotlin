package com.rmarioo.bottle99

import java.io.File

class LoadSong
{
    fun songToString(): String {
        val file: String = ClassLoader.getSystemResource("song_with_six_pack.txt").file

        val text = File(file).readText();
        return text
    }
}
