package com.adeef.myapplication.sports

import android.app.Activity
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import com.adeef.myapplication.sports.ui.SportsApp
import com.adeef.myapplication.sports.ui.theme.SportsTheme

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun ScreenSportsApp() {
    SportsTheme {
        val layoutDirection = LocalLayoutDirection.current
        Surface(
            modifier = Modifier
                .padding(
                    start = WindowInsets.safeDrawing.asPaddingValues()
                        .calculateStartPadding(layoutDirection),
                    end = WindowInsets.safeDrawing.asPaddingValues()
                        .calculateEndPadding(layoutDirection)
                )
        ) {
            val context = LocalContext.current
            val windowSize = calculateWindowSizeClass(context as Activity)
            SportsApp(
                windowSize = windowSize.widthSizeClass,
                onBackPressed = { context.finish() }
            )
        }
    }
}