package com.task.gamecompose.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
import com.task.gamecompose.R

@Composable
fun TournamentCard(image: Painter, heading1: String, date: String, entry: String, space: String) {
    Card(
        modifier = Modifier
            .width(240.dp)
            .border(
                width = 1.dp,
                color = colorResource(id = R.color.grey),
                shape = RoundedCornerShape(10.dp)
            )
            .wrapContentHeight(),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.background)),
        elevation = CardDefaults.elevatedCardElevation(4.dp)
    ) {
        Column {
            // Top half with image
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.53f) // Adjust height as needed
            )

            Spacer(modifier = Modifier.height(4.dp))
            // Bottom half
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, top = 4.dp, end = 12.dp)
            ) {
                // First heading
                Text(
                    text = heading1,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White
                )

                // Second heading
                Text(
                    text = date,
                    fontSize = 12.sp,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(8.dp))

                // First row of text items
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = entry,
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

                    // Row for Space text and icon
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.clarity_group_solid),
                            contentDescription = "space",
                            tint = Color.White,
                            modifier = Modifier.size(14.dp) // Adjust size as needed
                        )
                        Text(
                            text = space,
                            fontSize = 12.sp,
                            color = Color.White
                        )
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        modifier = Modifier.align(Alignment.CenterVertically),
                        text = "See Tournament Details",
                        fontSize = 16.sp,
                        color = Color.White
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.ph_arrow_up_bold),
                        contentDescription = "Arrow",
                        tint = Color.Unspecified,
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(3.dp))
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TournamentCardPreview() {
    TournamentCard(
        image = painterResource(id = R.drawable.image_121),
        heading1 = "PUBG tournament By Red Bull",
        date = "Jun 26 - Jun 27, 2024",
        entry = "Entry - 10",
        space = "670/800"
    )
}

@Composable
fun TournamentCardList() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        items(10) { // Adjust the number of items as needed
            TournamentCard(
                image = painterResource(id = R.drawable.image_121),
                heading1 = "PUBG tournament By Red Bull",
                date = "Jun 26 - Jun 27, 2024",
                entry = "Entry - 10",
                space = "670/800"
            )
            Spacer(modifier = Modifier.width(8.dp)) // Space between cards
        }
    }
}