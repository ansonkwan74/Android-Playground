package com.example.testbed.ui.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.testbed.ui.home.about.view.AboutScreen
import com.example.testbed.ui.home.dashboard.view.DashboardScreen

fun NavGraphBuilder.homeGraph(navController: NavController) {
    navigation(startDestination = "dashboard", route = "home") {
        composable(route = "dashboard") {
            DashboardScreen(navigateToAbout = { navController.navigate("about") })
        }
        composable(route = "about") {
            AboutScreen()
        }
    }
}