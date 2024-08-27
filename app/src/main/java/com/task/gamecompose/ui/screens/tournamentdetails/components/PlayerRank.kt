package com.task.gamecompose.ui.screens.tournamentdetails.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.task.gamecompose.R
import com.task.gamecompose.ui.screens.home.components.PeopleToFollow
import com.task.gamecompose.ui.screens.tournaments.components.MyTournamentCard


@Composable
fun PlayerRank() {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(id = R.color.background))
                .padding(top = 5.dp, bottom = 5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            Row(verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.frame_2609267),
                    contentDescription = null,
                    tint = Color.Unspecified, // Optional: keep original color
                    modifier = Modifier.size(40.dp)
                )
                Column {
                    Text(
                        text = "Legend Gamer",
                        fontSize = 16.sp,
                        color = Color.White,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                    Text(
                        text = "Gamehok Rank- 1123",
                        fontSize = 12.sp,
                        color = Color.White,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
            }

            Button(onClick = { /*TODO: Add action*/ },
                shape = RoundedCornerShape(12.dp), // Rounded corners
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF004B23), // Dark green background color
                    contentColor = Color.White // White text color
                ),) {
                Row( verticalAlignment = androidx.compose.ui.Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_park_outline_ranking),
                        contentDescription = null,
                        tint = Color.Unspecified, // Optional: keep original color
                        modifier = Modifier.size(16.dp))
                    Text("04")
                }
            }
        }
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp), // Space around the divider
            thickness = 1.dp,
            color = colorResource(id = R.color.darkgrey)
        )
    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun IconRowPreview() {
    RankList()
}

@Composable
fun RankList(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(colorResource(id = R.color.background))
    ) {
        // Assuming you want a fixed number of items
        repeat(10) { // Adjust the number of items as needed
            PlayerRank()
            Spacer(modifier = Modifier.height(8.dp)) // Space between cards
        }
    }
}