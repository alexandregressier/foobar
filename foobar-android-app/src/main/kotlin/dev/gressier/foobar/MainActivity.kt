package dev.gressier.foobar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dev.gressier.foobar.presentation.FooBarTheme
import dev.gressier.foobar.presentation.greeting.GreetingView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FooBarTheme {
                GreetingView()
            }
        }
    }
}