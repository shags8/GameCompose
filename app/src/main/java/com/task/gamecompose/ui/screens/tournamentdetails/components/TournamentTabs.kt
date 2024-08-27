package com.task.gamecompose.ui.screens.tournamentdetails.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.task.gamecompose.R
import com.task.gamecompose.ui.screens.home.HomeScreen
import com.task.gamecompose.ui.screens.tournamentdetails.tabs.OverView
import com.task.gamecompose.ui.screens.tournamentdetails.tabs.StandingsScreen

@Composable
fun TournamentTabs() {
    var selectedTabIndex by remember { mutableIntStateOf(0) }

    val tabTitles = listOf("Standings", "Overview", "Rules")

    TabRow(
        modifier = Modifier.fillMaxWidth() ,
        selectedTabIndex = selectedTabIndex,
        containerColor = colorResource(id = R.color.background),
        contentColor = Color.White,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.tabIndicatorOffset(tabPositions[selectedTabIndex]),
                color = Color.White,
                height = 2.dp
            )
        }
    ) {
        tabTitles.forEachIndexed { index, title ->
            Tab(
                selected = selectedTabIndex == index,
                onClick = { selectedTabIndex = index },
                text = {
                    Text(
                        text = title,
                        color = if (selectedTabIndex == index) Color.White else Color.Gray,
                        style = MaterialTheme.typography.bodyLarge
                    )
                },
            )
        }
    }
    when (selectedTabIndex) {
        0 -> StandingsScreen()
        1 -> OverView()
        2 -> OverView()
    }
}

@Preview(showBackground = true)
@Composable
fun TournamentTabsPreview() {
    TournamentTabs()
}