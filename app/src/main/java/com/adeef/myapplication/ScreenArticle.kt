package com.adeef.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeef.myapplication.ui.theme.MyApplicationTheme

@Composable
fun ScreenArticle(title: String,
                  shortDescription: String,
                  longDescription: String,
                  imagePainter: Painter,
                  modifier: Modifier = Modifier,) {

    Column {
        Image(
            painter = imagePainter,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp),

        )
        Text(
            text = shortDescription,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),

            )

        Text(
            text = longDescription,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp),

            )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenArticlePreview() {
    MyApplicationTheme {
        ScreenArticle(
            title = stringResource(R.string.jetpack_compose_tutorial),
            shortDescription = stringResource(R.string.compose_short_desc),
            longDescription = stringResource(R.string.compose_long_desc),
            imagePainter = painterResource(R.drawable.bg_compose_background),
            modifier = Modifier.fillMaxSize()
        )
    }
}