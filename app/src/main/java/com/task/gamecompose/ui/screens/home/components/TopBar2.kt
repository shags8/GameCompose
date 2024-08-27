package com.task.gamecompose.ui.screens.home.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.task.gamecompose.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar2() {
    TopAppBar( colors = TopAppBarDefaults.topAppBarColors(
        containerColor = colorResource(id = R.color.background) // Set background color
    ),
        title = {
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.carbon_user_avatar_filled), // Replace with your profile icon resource
                    contentDescription = "Profile" ,// Optional, for accessibility
                    tint = Color.White
                )
            }
        },
        actions = {
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.frame_2608994), // Replace with your profile icon resource
                    contentDescription = "Profile",
                    modifier = Modifier.align(Alignment.CenterVertically)
                        .padding(end=13.dp),
                    tint = Color.Unspecified
                )
                Icon(
                    painter = painterResource(id = R.drawable.mingcute_notification_fill), // Replace with your profile icon resource
                    contentDescription = "Profile",
                    modifier = Modifier.align(Alignment.CenterVertically),
                    tint = Color.White
                )
            }
        }
    )
}