package com.example.testbed.ui.home.dashboard.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun DashboardScreen(
    navigateToAbout: () -> Unit
) {
    Column {
        Text("This is the dashboard.")
        Spacer(modifier = Modifier)
        Button(onClick = navigateToAbout) {
            Text("about")
        }
    }

}