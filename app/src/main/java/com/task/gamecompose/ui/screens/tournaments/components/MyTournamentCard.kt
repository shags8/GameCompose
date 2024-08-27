package com.task.gamecompose.ui.screens.tournaments.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.task.gamecompose.R
import com.task.gamecompose.ui.navigation.Screen

@Composable
fun MyTournamentCard(
    logoPainter: Painter,
    tournamentName: String,
    organizer: String,
    mode: String,
    entryFee: Int,
    date: String,
    prizePool: Int,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .border(
                width = 1.dp,
                color = colorResource(id = R.color.grey),
                shape = RoundedCornerShape(12.dp)
            ),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.background)),
        elevation = CardDefaults.elevatedCardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            // Tournament Info
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row {
                    Column {
                        Text(
                            text = tournamentName,
                            color = Color.White,
                            fontSize = 16.sp
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = organizer,
                            color = Color(0xFFA8A8A8),
                            fontSize = 12.sp
                        )
                    }
                }
                Image(
                    painter = logoPainter,
                    contentDescription = "Tournament Logo",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)
                )
            }

            Spacer(modifier = Modifier.height(6.dp))

            // Mode, Entry Fee
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = mode,
                    color = Color.White,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .background(Color(0xFF006600), shape = RoundedCornerShape(8.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                )
                Text(
                    text = "BGMI",
                    color = Color.White,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .background(Color(0xFF006600), shape = RoundedCornerShape(8.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                )
                Text(
                    text = "Entry - $entryFee",
                    color = Color.White,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .background(Color(0xFF006600), shape = RoundedCornerShape(8.dp))
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Date and Time
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.openmoji_timer),
                    contentDescription = "Time Icon",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = date,
                    color = Color.White,
                    fontSize = 12.sp
                )
            }

            // Prize Pool
            Row(verticalAlignment = Alignment.CenterVertically
            , horizontalArrangement = Arrangement.SpaceBetween
            , modifier = Modifier.fillMaxWidth()) {
                Row {
                    Icon(
                        painter = painterResource(id = R.drawable.twemoji_trophy),
                        contentDescription = "Prize Icon",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "Prize Pool- 1000",
                            fontSize = 12.sp,
                            color = Color.White
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.twemoji_coin),
                            contentDescription = "coin",
                            tint = Color.Unspecified,
                            modifier = Modifier.size(14.dp) // Adjust size as needed
                        )
                    }
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .background(Color(0xFFDB7627), shape = RoundedCornerShape(16.dp))
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text(text = "Upcoming", color = Color.White, fontSize = 12.sp)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyTournamentCardPreview() {
    MyTournamentCard(
        logoPainter = painterResource(id = R.drawable.frame_2609475), // Replace with your image resource
        tournamentName = "PUBG Tournament",
        organizer = "By Red Bull",
        mode = "Solo",
        entryFee = 10,
        date = "Starts 3rd Aug at 10:00 pm",
        prizePool = 1000,
        onClick = {
        }
    )
}

@Composable
fun MyTournamentCardList(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        items(10) { // Adjust the number of items as needed
            MyTournamentCard(
                logoPainter = painterResource(id = R.drawable.frame_2609475), // Replace with your image resource
                tournamentName = "PUBG Tournament",
                organizer = "By Red Bull",
                mode = "Solo",
                entryFee = 10,
                date = "Starts 3rd Aug at 10:00 pm",
                prizePool = 1000,
                onClick = {
                    navController.navigate(Screen.TournamentDetails.route) // Navigate to TournamentDetailsScreen
                }
            )
            Spacer(modifier = Modifier.height(8.dp)) // Space between cards
        }
    }
}