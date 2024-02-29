package com.adeef.myapplication.unscramble

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.adeef.myapplication.unscramble.theme.UnscrambleTheme
import com.example.unscramble.ui.GameScreen

@Composable
fun ScreenUnscrambleApp(modifier: Modifier = Modifier) {

UnscrambleTheme {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {
        GameScreen()
    }
}
}