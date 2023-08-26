package com.example.testbed.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val label: String,
    val icon: ImageVector
) {
    object Home : Screen(
        route = "home",
        label = "Home",
        icon = Icons.Filled.Home
    )
    object Test : Screen(
        route = "test",
        label = "Test",
        icon = Icons.Filled.Warning
    )
}

val screensList = listOf(
    Screen.Home,
    Screen.Test
)