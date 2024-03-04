package com.adeef.myapplication.reply

import android.app.Activity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.adeef.myapplication.AboutCard
import com.adeef.myapplication.ContactInformation
import com.adeef.myapplication.reply.ui.ReplyApp
import com.example.reply.ui.theme.ReplyTheme
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun ScreenReplyApp() {
    ReplyTheme {
        Surface {
            val context = LocalContext.current
            val windowSize = calculateWindowSizeClass(context as Activity)
            ReplyApp(
                windowSize = windowSize.widthSizeClass
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ReplyAppPreview() {
    ReplyTheme {
        Surface {
            ReplyApp(
                windowSize = WindowWidthSizeClass.Compact,
            )
        }
    }
}
