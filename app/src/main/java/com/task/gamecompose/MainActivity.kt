package com.task.gamecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.task.gamecompose.ui.components.TopBar
import com.task.gamecompose.ui.navigation.BottomNavApp
import com.task.gamecompose.ui.theme.GameComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameComposeTheme {
                BottomNavApp()
            }
        }
    }
}


@Preview(showBackground = true,showSystemUi = true)
@Composable
fun AppPreview() {
    BottomNavApp()
}