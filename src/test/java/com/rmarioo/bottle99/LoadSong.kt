package com.rmarioo.bottle99

import java.io.File

class LoadSong
{
    fun songToString(): String {
        val file: String = ClassLoader.getSystemResource("song_six_packs.txt").file

        val text = File(file).readText();
        return text
    }
}
