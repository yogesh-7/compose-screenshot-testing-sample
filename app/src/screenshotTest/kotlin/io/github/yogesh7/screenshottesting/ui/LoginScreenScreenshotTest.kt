package io.github.yogesh7.screenshottesting.ui

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest

// Each @PreviewTest + @Preview pair is one screenshot. Because LoginScreen is stateless,
// every state is just a different LoginUiState.

@Composable
private fun Login(state: LoginUiState, darkTheme: Boolean = false) {
    SampleTheme(darkTheme = darkTheme) {
        LoginScreen(state = state, onPhoneChange = {}, onContinue = {})
    }
}

@PreviewTest
@Preview(widthDp = 360, heightDp = 640)
@Composable
fun LoginEmpty() {
    Login(LoginUiState())
}

@PreviewTest
@Preview(widthDp = 360, heightDp = 640)
@Composable
fun LoginFilled() {
    Login(LoginUiState(phone = "9876543210"))
}

@PreviewTest
@Preview(widthDp = 360, heightDp = 640)
@Composable
fun LoginLoading() {
    Login(LoginUiState(phone = "9876543210", isLoading = true))
}

@PreviewTest
@Preview(widthDp = 360, heightDp = 640)
@Composable
fun LoginError() {
    Login(LoginUiState(phone = "98765", error = "Enter a 10-digit number"))
}

// Dark mode: the theme reads the flag, and uiMode also flips any system-driven colours.
@PreviewTest
@Preview(widthDp = 360, heightDp = 640, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun LoginFilledDark() {
    Login(LoginUiState(phone = "9876543210"), darkTheme = true)
}

// Locales come free: values-hi is picked up from the locale qualifier.
@PreviewTest
@Preview(widthDp = 360, heightDp = 640, locale = "hi")
@Composable
fun LoginFilledHindi() {
    Login(LoginUiState(phone = "9876543210"))
}

// Accessibility: the largest common font scale is where layouts usually break.
@PreviewTest
@Preview(widthDp = 360, heightDp = 640, fontScale = 1.5f)
@Composable
fun LoginFilledLargeFont() {
    Login(LoginUiState(phone = "9876543210"))
}
