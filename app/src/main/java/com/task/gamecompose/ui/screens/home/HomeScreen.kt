package com.task.gamecompose.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.task.gamecompose.R
import com.task.gamecompose.ui.screens.home.components.ImageGridWithHeader
import com.task.gamecompose.ui.screens.home.components.PagerWithTabs
import com.task.gamecompose.ui.screens.home.components.PeopleToFollow
import com.task.gamecompose.ui.screens.home.components.TopBar2
import com.task.gamecompose.ui.screens.home.components.TournamentCardList

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background))
    ) {
        // TopBar2 and PagerWithTabs as individual items
        item {
            TopBar2()
        }
        item {
            PagerWithTabs()
        }
        item {
            ImageGridWithHeader()
        }
        item {
            Column(
                modifier = Modifier
                    .padding(start = 16.dp, top = 20.dp, end = 16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Compete in Battles",
                        style = MaterialTheme.typography.titleLarge,
                        color = colorResource(id = R.color.white),

                        )
                    Text(
                        text = "View All",
                        style = MaterialTheme.typography.titleMedium,
                        color = colorResource(id = R.color.green)
                    )
                }
                TournamentCardList()
            }
        }
        item {
            Column(
                modifier = Modifier
                    .padding(start = 16.dp, top = 20.dp, end = 16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "People to follow",
                        style = MaterialTheme.typography.titleLarge,
                        color = colorResource(id = R.color.white),

                        )
                    Text(
                        text = "View All",
                        style = MaterialTheme.typography.titleMedium,
                        color = colorResource(id = R.color.green)
                    )
                }
                PeopleToFollow()
                PeopleToFollow()
                PeopleToFollow()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}