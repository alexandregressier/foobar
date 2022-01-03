package dev.gressier.foobar

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}