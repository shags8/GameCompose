package com.task.gamecompose.ui.navigation

import com.task.gamecompose.R


sealed class Screen(val route: String, val title: String, val icon: Int) {
    data object Home : Screen("home", "Home", R.drawable.fluent_home_48_filled)
    data object Tournament : Screen("tournament", "tournament", R.drawable.solar_cup_bold)
    data object LeaderBoard : Screen("leaderboard", "leaderboard", R.drawable.clarity_group_solid)
    data object Stream : Screen("Stream", "Stream", R.drawable.solar_stream_bold)
    data object TournamentDetails : Screen("tournamentDetails", "Tournament Details", R.drawable.clarity_group_solid) // Adjust the icon if needed

}