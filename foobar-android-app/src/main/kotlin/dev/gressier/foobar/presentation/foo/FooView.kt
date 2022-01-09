package dev.gressier.foobar.presentation.foo

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.gressier.foobar.presentation.FooBarTheme
import dev.gressier.foobar.shared.Greeting

@Composable
fun FooView() {
    val greeting = Greeting().greeting()

    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(greeting)
    }
}

@Preview(showBackground = true)
@Composable
private fun FooView_Preview() {
    FooBarTheme {
        FooView()
    }
}