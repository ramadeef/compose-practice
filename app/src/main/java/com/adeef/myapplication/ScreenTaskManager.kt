package com.adeef.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeef.myapplication.ui.theme.MyApplicationTheme
import org.w3c.dom.Text

@Composable
fun ScreenTaskManager(imagePainter: Painter,
                      title:String,
                      subTitle:String,
                      modifier: Modifier = Modifier,) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = imagePainter,
                contentDescription = null,
                contentScale = ContentScale.Crop

            )
            Text(
                text = title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top=24.dp,bottom = 8.dp),

                )
            Text(
                text = subTitle,
                fontSize = 16.sp,
            )
        }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenTaskManagerPreview() {
    MyApplicationTheme {
        ScreenTaskManager(
            title = "All task complted",
            subTitle ="Nice work!",
            imagePainter = painterResource(R.drawable.ic_task_completed),
            modifier = Modifier.fillMaxSize()
        )
    }
}