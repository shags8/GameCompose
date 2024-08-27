package com.task.gamecompose.ui.screens.tournamentdetails.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.task.gamecompose.R
import com.task.gamecompose.ui.screens.tournamentdetails.components.PlayerRank
import com.task.gamecompose.ui.screens.tournamentdetails.components.RankList


@Composable
fun StandingsScreen(){
    Column (modifier = Modifier.fillMaxSize().background(colorResource(id = R.color.background)).
    padding(16.dp).verticalScroll(rememberScrollState())){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
                .background(color = colorResource(id = R.color.background))
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Box(contentAlignment = Alignment.BottomCenter
                        , modifier = Modifier.
                        weight(1f)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.frame_2609267), contentDescription = "2nd place",
                                modifier = Modifier
                                    .size(60.dp)
                                    .align(Alignment.CenterHorizontally))
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "Legend Gamer",
                                    fontSize = 16.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                                Text(
                                    text = "G Rank- 1123",
                                    fontSize = 12.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                            }
                            Image(painter = painterResource(id = R.drawable.group_1214), contentDescription = "2nd place",
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .fillMaxWidth()
                                    .offset(x=15.dp)
                            , contentScale = ContentScale.Crop)
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .zIndex(1f)
                ) {
                    Box(contentAlignment = Alignment.BottomCenter
                        , modifier = Modifier.
                        weight(1f)
                            .zIndex(1f)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.frame_2609267), contentDescription = "2nd place",
                                modifier = Modifier
                                    .size(60.dp)
                                    .align(Alignment.CenterHorizontally))
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "Legend Gamer",
                                    fontSize = 16.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                                Text(
                                    text = "G Rank- 1123",
                                    fontSize = 12.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                            }
                            Image(painter = painterResource(id = R.drawable.group_1212), contentDescription = "2nd place",
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .fillMaxWidth()
                                , contentScale = ContentScale.Crop)
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    Box(contentAlignment = Alignment.BottomCenter
                        , modifier = Modifier.
                        weight(1f)) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(painter = painterResource(id = R.drawable.frame_2609267), contentDescription = "2nd place",
                                modifier = Modifier
                                    .size(60.dp)
                                    .align(Alignment.CenterHorizontally))
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    text = "Legend Gamer",
                                    fontSize = 16.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                                Text(
                                    text = "G Rank- 1123",
                                    fontSize = 12.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                            }
                            Image(painter = painterResource(id = R.drawable.group_1213), contentDescription = "2nd place",
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .fillMaxWidth()
                                    .offset(x= (-20).dp)
                                , contentScale = ContentScale.FillWidth)
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        RankList()
        Spacer(modifier = Modifier.height(70.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun StandingsScreenPreview() {
    StandingsScreen()
}
