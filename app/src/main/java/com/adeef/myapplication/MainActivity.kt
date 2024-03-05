package com.adeef.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adeef.myapplication.cupcake.CupcakeApp
import com.adeef.myapplication.reply.ScreenReplyApp
import com.adeef.myapplication.reply.ui.ReplyApp
import com.adeef.myapplication.sports.ScreenSportsApp
import com.adeef.myapplication.superheroes.ScreenSuperheroesApp
import com.adeef.myapplication.ui.theme.MyApplicationTheme
import com.adeef.myapplication.unscramble.ScreenUnscrambleApp
import com.adeef.myapplication.wolf.ScreenWolfApp
import com.adeef.myapplication.wolf.theme.WoofTheme
import com.example.reply.ui.theme.ReplyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MyApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    ScreenTipCalculator(modifier = Modifier
//                        .fillMaxSize()
//                        .wrapContentSize(Alignment.Center)
//                    )
                   /// ScreenAffirmationsApp()
                   // ScreenGridApp()
//                    WoofTheme{
//                        ScreenWolfApp()
//                    }
            //ScreenUnscrambleApp()
            //CupcakeApp()
            //ScreenReplyApp()
            ScreenSportsApp()
   //                 ScreenSuperheroesApp()
  //              }
  //          }
        }
    }
}

@Composable
fun Greeting(message: String,from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F,
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }

}

@Composable
fun GreetingText(message: String,from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = "$message!",
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = "From $from",
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting(stringResource(R.string.happy_birthday_ramesh), stringResource(R.string.emma))
    }
}