package io.github.yogesh7.screenshottesting.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF1F7A4D),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFE6F4EC),
    onPrimaryContainer = Color(0xFF0B3B24),
    background = Color(0xFFFBF6EF),
    surface = Color.White,
    error = Color(0xFFB3261E),
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFF6FD8A0),
    onPrimary = Color(0xFF00391F),
    primaryContainer = Color(0xFF0F5233),
    onPrimaryContainer = Color(0xFFC9F2DA),
    background = Color(0xFF15120F),
    surface = Color(0xFF221E1A),
)

@Composable
fun SampleTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content,
    )
}
