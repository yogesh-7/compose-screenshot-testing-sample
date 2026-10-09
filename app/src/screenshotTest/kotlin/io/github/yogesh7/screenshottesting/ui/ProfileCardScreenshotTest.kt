package io.github.yogesh7.screenshottesting.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.tools.screenshot.PreviewTest

@Composable
private fun Card(profile: Profile, darkTheme: Boolean = false) {
    SampleTheme(darkTheme = darkTheme) {
        ProfileCard(profile = profile, onEdit = {}, modifier = Modifier.padding(16.dp))
    }
}

@PreviewTest
@Preview(widthDp = 360, showBackground = true)
@Composable
fun ProfileMember() {
    Card(Profile(name = "Asha Sharma", plan = "Gold", coins = 1250))
}

@PreviewTest
@Preview(widthDp = 360, showBackground = true)
@Composable
fun ProfileFreePlan() {
    Card(Profile(name = "Ravi Kumar", plan = null, coins = 0))
}

// Edge case: a long name must ellipsize instead of pushing the coins badge off the card.
@PreviewTest
@Preview(widthDp = 360, showBackground = true)
@Composable
fun ProfileLongName() {
    Card(Profile(name = "Venkatanarasimharajuvaripeta Subramanian", plan = "Platinum", coins = 98765))
}

@PreviewTest
@Preview(widthDp = 360, showBackground = true, backgroundColor = 0xFF15120F, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun ProfileMemberDark() {
    Card(Profile(name = "Asha Sharma", plan = "Gold", coins = 1250), darkTheme = true)
}

@PreviewTest
@Preview(widthDp = 360, showBackground = true, locale = "hi")
@Composable
fun ProfileMemberHindi() {
    Card(Profile(name = "आशा शर्मा", plan = "गोल्ड", coins = 1250))
}
