package io.github.yogesh7.screenshottesting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.github.yogesh7.screenshottesting.ui.LoginScreen
import io.github.yogesh7.screenshottesting.ui.LoginUiState
import io.github.yogesh7.screenshottesting.ui.SampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleTheme {
                // State lives here, not inside the screen, so the screen stays testable.
                var state by remember { mutableStateOf(LoginUiState()) }
                LoginScreen(
                    state = state,
                    onPhoneChange = { state = state.copy(phone = it.filter(Char::isDigit).take(10), error = null) },
                    onContinue = { state = state.copy(isLoading = true) },
                )
            }
        }
    }
}
