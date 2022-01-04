package dev.gressier.foobar.shared

class Greeting {
    fun greeting(): String =
        "Hello, ${Platform().platform}!"
}