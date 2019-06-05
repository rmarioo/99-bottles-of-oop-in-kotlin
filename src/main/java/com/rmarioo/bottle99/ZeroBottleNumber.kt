package com.rmarioo.bottle99

class ZeroBottleNumber() : BottleNumber(0) {

    override fun quantity() = "no more"

    override fun action(): String {
            return "Go to the store and buy some more, "

    }

    override fun successor() = 99


}