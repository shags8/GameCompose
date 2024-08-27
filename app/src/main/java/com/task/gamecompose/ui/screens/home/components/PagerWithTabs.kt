package com.task.gamecompose.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.task.gamecompose.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun PagerWithTabs() {
    val images = listOf(
        R.drawable.image_136,
        R.drawable.image_136,
        R.drawable.image_136
    )
    AutoScrollPager(images = images)
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun AutoScrollPager(images: List<Int>) {
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()

    // Automatically scroll through pages
    LaunchedEffect(Unit) {
        while (true) {
            delay(3000) // Delay in milliseconds
            coroutineScope.launch {
                val nextPage = (pagerState.currentPage + 1) % images.size
                pagerState.animateScrollToPage(nextPage)
            }
        }
    }

    Column( modifier = Modifier
        .padding(top = 10.dp,start=16.dp,end=16.dp)
        .background(colorResource(id = R.color.background))){
        HorizontalPager(
            count = images.size,
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
        ) { page ->
            Image(
                painter = painterResource(id = images[page]),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(2.18f)
            )
        }

        DotsIndicator(
            pagerState = pagerState,
            dotCount = images.size,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun DotsIndicator(
    pagerState: PagerState,
    dotCount: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
    ) {
        repeat(dotCount) { index ->
            val dotColor = if (pagerState.currentPage == index) {
                Color.White
            } else {
                Color.Gray
            }

            Box(
                modifier = Modifier
                    .size(8.dp)
                    .background(color = dotColor, shape = CircleShape)
            )
            // Add Spacer between dots
            if (index < dotCount - 1) {
                Spacer(modifier = Modifier.width(16.dp)) // Adjust the width for spacing
            }
        }
    }
}