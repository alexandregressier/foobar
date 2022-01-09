package dev.gressier.foobar.android.presentation.bar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.gressier.foobar.android.FooBarTheme

@Composable
fun BarView() {
    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text("Bar")
    }
}

@Preview(showBackground = true)
@Composable
private fun BarView_Preview() {
    FooBarTheme {
        BarView()
    }
}