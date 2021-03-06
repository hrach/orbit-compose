package kiwi.orbit.compose.catalog.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kiwi.orbit.compose.catalog.SubScreen
import kiwi.orbit.compose.ui.controls.AlertCritical
import kiwi.orbit.compose.ui.controls.AlertInfo
import kiwi.orbit.compose.ui.controls.AlertSuccess
import kiwi.orbit.compose.ui.controls.AlertWarning
import kiwi.orbit.compose.ui.controls.ButtonPrimary
import kiwi.orbit.compose.ui.controls.ButtonPrimarySubtle
import kiwi.orbit.compose.ui.controls.Surface
import kiwi.orbit.compose.ui.controls.Text

@Composable
fun AlertScreen(onUpClick: () -> Unit) {
    SubScreen(
        title = "Alert",
        onUpClick = onUpClick,
    ) {
        AlertScreenInner()
    }
}

@Preview
@Composable
fun AlertScreenInner() {
    Surface {
        Column(
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            AlertInfo(
                title = { Text("Re-check your credentials") },
                content = { Text("To avoid boarding complications, your entire name must be entered exactly as it appears in your passport/ID.") },
                actions = {
                    ButtonPrimary(onClick = {}) {
                        Text("More info")
                    }
                    ButtonPrimarySubtle(onClick = {}) {
                        Text("Mark as checked")
                    }
                },
            )

            Spacer(Modifier.height(16.dp))

            AlertSuccess(
                title = { Text("Your payment was successful.") },
                content = { Text("View the receipt in the profile:") },
                actions = {
                    ButtonPrimary(onClick = {}) {
                        Text("Show receipt")
                    }
                    ButtonPrimarySubtle(onClick = {}) {
                        Text("Share receipt")
                    }
                }
            )

            Spacer(Modifier.height(16.dp))

            AlertWarning(
                title = { Text("Visa requirements check") },
                content = { Text("The requirements found here are for reference purposes only. Contact the embassy or your foreign ministry for more information.") },
                actions = {
                    ButtonPrimary(onClick = {}) {
                        Text("Check requirements")
                    }
                    ButtonPrimarySubtle(onClick = {}) {
                        Text("Mark as checked")
                    }
                },
            )

            Spacer(Modifier.height(16.dp))

            AlertCritical(
                title = { Text("No results loaded") },
                content = { Text("There was an error while processing your request. Refresh the page to load the results.") },
                actions = {
                    ButtonPrimary(onClick = {}) {
                        Text("Refresh page")
                    }
                    ButtonPrimarySubtle(onClick = {}) {
                        Text("Contact support")
                    }
                },
            )

            Spacer(Modifier.height(16.dp))
            Text("Alternative versions")
            Spacer(Modifier.height(8.dp))

            AlertInfo(
                title = { Text("Re-check your credentials") },
                content = { Text("To avoid boarding complications, your entire name must be entered exactly as it appears in your passport/ID.") },
                actions = {
                    ButtonPrimary(onClick = {}) {
                        Text("More info")
                    }
                },
            )

            Spacer(Modifier.height(16.dp))

            AlertInfo(
                title = { Text("Re-check your credentials") },
                content = { Text("To avoid boarding complications, your entire name must be entered exactly as it appears in your passport/ID.") },
                actions = {
                    ButtonPrimarySubtle(onClick = {}) {
                        Text("Mark as checked")
                    }
                },
            )

            Spacer(Modifier.height(16.dp))

            AlertInfo(
                title = { Text("Re-check your credentials") },
                content = { Text("To avoid boarding complications, your entire name must be entered exactly as it appears in your passport/ID.") },
            )

            Spacer(Modifier.height(16.dp))

            AlertInfo(
                icon = null,
                title = { Text("Re-check your credentials") },
                content = { Text("To avoid boarding complications, your entire name must be entered exactly as it appears in your passport/ID.") },
                actions = {
                    ButtonPrimary(onClick = {}) {
                        Text("More info")
                    }
                    ButtonPrimarySubtle(onClick = {}) {
                        Text("Mark as checked")
                    }
                },
            )

            Spacer(Modifier.height(16.dp))

            AlertInfo(
                icon = null,
                title = { Text("Re-check your credentials") },
                content = {
                    Text("To avoid boarding complications, your entire name must be entered exactly as it appears in your passport/ID.")
                    Text("Alternatively, provide a second paragraph.")
                },
                actions = {
                    ButtonPrimarySubtle(onClick = {}) {
                        Text("Mark as checked")
                    }
                },
            )

            Spacer(Modifier.height(16.dp))

            AlertInfo(
                icon = null,
                title = { Text("Re-check your credentials") },
                content = { Text("To avoid boarding complications, your entire name must be entered exactly as it appears in your passport/ID.") },
            )
        }
    }
}
