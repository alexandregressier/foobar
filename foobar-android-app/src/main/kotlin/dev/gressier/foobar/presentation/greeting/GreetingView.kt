package dev.gressier.foobar.presentation.greeting

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.gressier.foobar.presentation.FooBarTheme
import dev.gressier.foobar.shared.Greeting

@Composable
fun GreetingView() {
    val greet = Greeting().greeting()

    Box(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        contentAlignment = Alignment.Center,
    ) {
        Text(greet)
    }
}

@Preview(showBackground = true)
@Composable
private fun GreetingView_Preview() {
    FooBarTheme {
        GreetingView()
    }
}