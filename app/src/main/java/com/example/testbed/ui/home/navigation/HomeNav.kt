package com.example.testbed.ui.home.navigation

import androidx.compose.material3.Text
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.homeGraph(navController: NavController) {
    navigation(startDestination = "dashboard", route = "home") {
        composable(route = "dashboard") {
            Text("Dashboard owo")
        }
    }
}