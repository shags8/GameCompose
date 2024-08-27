package com.task.gamecompose.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.task.gamecompose.ui.components.BottomNavigationBar
import com.task.gamecompose.ui.screens.home.HomeScreen
import com.task.gamecompose.ui.screens.tournamentdetails.TournamentDetailsScreen
import com.task.gamecompose.ui.screens.tournaments.TournamentScreen

@Composable
fun BottomNavApp() {
    val navController = rememberNavController()

    // Observe the current back stack entry
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    // Determine whether to show the bottom bar based on the current route
    val shouldShowBottomBar by remember {
        derivedStateOf {
            navBackStackEntry?.destination?.route != Screen.TournamentDetails.route
        }
    }
    Scaffold(
        bottomBar = {
            if (shouldShowBottomBar) {
                BottomNavigationBar(navController = navController)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) { HomeScreen() }
            composable(Screen.Tournament.route) { TournamentScreen(navController) }
            composable(Screen.LeaderBoard.route) { HomeScreen() }
            composable(Screen.Stream.route) { HomeScreen() }
            composable(Screen.TournamentDetails.route) { TournamentDetailsScreen() }
        }
    }
}

fun shouldShowBottomBar(currentRoute: String): Boolean {
    return when (currentRoute) {
        Screen.Home.route,
        Screen.Tournament.route,
        Screen.LeaderBoard.route,
        Screen.Stream.route -> true
        else -> false
    }
}
