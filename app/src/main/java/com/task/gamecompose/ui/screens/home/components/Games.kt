package com.task.gamecompose.ui.screens.home.components

import androidx.compose.foundation.Image
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
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.task.gamecompose.R


@Composable
fun ImageGridWithHeader() {

    Column(
        modifier = Modifier
            .padding(start=16.dp, top = 5.dp,end=16.dp)
    ) {
        // Row for header texts
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Play Tournament by Games",
                style = MaterialTheme.typography.titleLarge,
                color = colorResource(id = R.color.white),

            )
            Text(
                text = "View All",
                style = MaterialTheme.typography.titleMedium,
                color = colorResource(id = R.color.green)
            )
        }

        // Row for the image grid
        Column {
            ImageRow(
                images = listOf(R.drawable.image_124, R.drawable.image_127, R.drawable.image_131),
                names = listOf("PUBG", "Valorent", "Apex Legends")
            )
            Spacer(modifier = Modifier.height(8.dp))
            ImageRow(
                images = listOf(R.drawable.image_132, R.drawable.image_133, R.drawable.image_124),
                names = listOf("Call of Duty", "Counter Strike", "PUBG")
            )
        }

        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp), // Space around the divider
            thickness = 1.dp,
            color = colorResource(id = R.color.darkgrey)
        )

        Image(
            painter = painterResource(id = R.drawable.frame_2609248),
            contentDescription = "banner",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(3.85f)
        )
    }
}

@Composable
fun ImageRow(images: List<Int>, names: List<String>) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        images.zip(names).forEach { (imageRes, name) ->
            ImageWithName(
                imageRes = imageRes,
                name = name,
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 4.dp)
            )
        }
    }
}

@Composable
fun ImageWithName(imageRes: Int, name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = name,
            modifier = Modifier
                .width(100.dp)
                .height(80.dp)
        )
        Text(
            text = name,
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .padding(top = 4.dp)
                .align(Alignment.CenterHorizontally),
            color = Color.White
        )
    }
}