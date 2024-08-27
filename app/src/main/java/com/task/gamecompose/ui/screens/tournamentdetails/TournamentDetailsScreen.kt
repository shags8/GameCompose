package com.task.gamecompose.ui.screens.tournamentdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.task.gamecompose.R
import com.task.gamecompose.ui.screens.tournamentdetails.components.TournamentTabs

@Composable
fun TournamentDetailsScreen(){

    Box() {

        Column(modifier = Modifier
            .background(colorResource(id = R.color.background))
            .fillMaxHeight()) {
            Image(
                painter = painterResource(id = R.drawable.image_121),
                contentDescription = "Display",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.95f),
                contentScale = androidx.compose.ui.layout.ContentScale.FillWidth
            )


            Spacer(modifier = Modifier.height(6.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Row {
                    Column {
                        Text(
                            text = "PUBG tournament  ",
                            color = Color.White,
                            fontSize = 22.sp
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Entry- 10",
                                fontSize = 16.sp,
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
                }
                Image(
                    painter = painterResource(id = R.drawable.frame_2609475),
                    contentDescription = "Tournament Logo",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 8.dp)
                )
            }
            Spacer(modifier = Modifier.height(4.dp))
            TournamentTabs()
        }


        Card(
            shape = RoundedCornerShape(0.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Black),
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .align(Alignment.BottomCenter)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF01B752)),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 18.dp)
                        .height(48.dp)
                ) {
                    Text(
                        text = "Join Tournament",
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TournamentDetailsScreenPreview(){
    TournamentDetailsScreen()
}