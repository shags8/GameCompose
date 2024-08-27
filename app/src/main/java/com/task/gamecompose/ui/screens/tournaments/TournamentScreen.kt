package com.task.gamecompose.ui.screens.tournaments

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.task.gamecompose.R
import com.task.gamecompose.ui.components.TopBar
import com.task.gamecompose.ui.screens.tournaments.components.MyTournamentCardList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TournamentScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .background(colorResource(id = R.color.background))
        .fillMaxHeight()) {
        TopBar()
        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 10.dp, bottom = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF182920),// Lighter green
                                Color(0xFF4D5A53), // Darker green
                            )
                        )
                    )
                    .padding(16.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    // Title
                    Text(
                        text = "Total Tournaments - 47",
                        style = MaterialTheme.typography.titleLarge.copy(fontSize = 20.sp),
                        color = Color.White,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    Spacer(modifier = Modifier.size(8.dp))

                    // Stats Row
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column() {
                            Text(text = "Won", color = Color.Gray, fontSize = 14.sp)
                            Spacer(modifier = Modifier.size(4.dp))
                            Text(text = "06", color = Color.White, fontSize = 20.sp)
                        }
                        Column() {
                            Text(text = "Top 3", color = Color.Gray, fontSize = 14.sp)
                            Spacer(modifier = Modifier.size(4.dp))
                            Text(text = "06", color = Color.White, fontSize = 20.sp)
                        }
                        Column() {
                            Text(text = "Rank (3-10)", color = Color.Gray, fontSize = 14.sp)
                            Spacer(modifier = Modifier.size(4.dp))
                            Text(text = "06", color = Color.White, fontSize = 20.sp)
                        }
                        Column() {
                            Text(text = "Lost", color = Color.Gray, fontSize = 14.sp)
                            Spacer(modifier = Modifier.size(4.dp))
                            Text(text = "06", color = Color.White, fontSize = 20.sp)
                        }
                    }
                }
            }
        }

        var text by remember { mutableStateOf("") }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(50.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = text,
                shape = RoundedCornerShape(10.dp),
                onValueChange = { newText -> text = newText },
                label = {
                    Text(
                        "Search",
                        fontSize = 12.sp
                    )
                },
                modifier = Modifier
                    .padding(end = 5.dp)
                    .weight(1f)
                    .background(color = colorResource(id = R.color.background))
                    .border(
                        width = 1.dp,
                        color = colorResource(id = R.color.grey),
                        shape = RoundedCornerShape(12.dp)
                    ),
                leadingIcon = {
                    Icon(
                        painterResource(id = R.drawable.mingcute_search_line),
                        contentDescription = "Search",
                        tint = Color.Unspecified
                    )
                },
                trailingIcon = {
                    Icon(
                        painterResource(id = R.drawable.frame_2608995),
                        contentDescription = "Filter",
                        tint = Color.Unspecified
                    )
                },
                textStyle = TextStyle(fontSize = 12.sp, color = Color.White),
                colors = TextFieldDefaults.textFieldColors(
                    cursorColor = Color.Gray,
                    containerColor = colorResource(id = R.color.background),  // Background color for the TextField
                    focusedIndicatorColor = Color.Transparent,  // Hide the indicator when focused
                    unfocusedIndicatorColor = Color.Transparent,  // Hide the indicator when unfocused
                    disabledIndicatorColor = Color.Transparent,  // Hide the indicator when disabled
                )

            )
            Button(
                onClick = { /*TODO: Add action*/ },
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .wrapContentWidth()
                    .fillMaxHeight(),
                shape = RoundedCornerShape(12.dp), // Rounded corners
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF01B752), // Dark green background color
                    contentColor = Color.White // White text color
                ),
            ) {
                Text(text="+Create", maxLines = 1)
            }
        }
        MyTournamentCardList(navController)
    }
}

@Preview
@Composable
fun TournamentScreenPreview() {
    val navController = rememberNavController()
    TournamentScreen(navController)
}