package com.adeef.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adeef.myapplication.ui.theme.MyApplicationTheme


@Composable
fun ScreenBusinessCard(modifier : Modifier =Modifier) {
    Box (modifier = Modifier.fillMaxSize(1f)){
        AboutCard(modifier.align(Alignment.Center))
        ContactInformation(modifier.align(Alignment.BottomCenter))
    }
}

@Composable
fun AboutCard(modifier : Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.android_logo)
        Image(painter = image, contentDescription = null, modifier = Modifier
            .height(120.dp)
            .width(150.dp))
        Text(text = "Ramesh Arnest",color = Color.White)
        Text(text = "Senior Android Engineer",color = Color(0xFF3ddc84))

    }
}

@Composable
fun ContactInformation(modifier : Modifier =Modifier){
    Column(
        modifier = Modifier

            .fillMaxWidth()
            .padding(top = 600.dp)
            .padding(bottom = 70.dp)

        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp,end=40.dp),

            ){
            val icon = painterResource(id = R.drawable.ic_baseline_local_phone_24)
            Icon(painter = icon, contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
            )
            Text(text = "+15672881736", modifier = Modifier.padding(start = 25.dp),color = Color.White)

        }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),
        ){
            val icon2 = painterResource(id = R.drawable.ic_baseline_email_24)
            Icon(painter = icon2, contentDescription = null,  modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84))
            Text(text = "abc@gmail.com", modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),
        ){
            val icon3 = painterResource(id = R.drawable.ic_baseline_share_24)
            Icon(painter = icon3, contentDescription = null, modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84) )
            Text(text = "ramesh-adeef", modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScreenBusinessCardPreview() {
    MyApplicationTheme {
        ScreenBusinessCard(
//            title = stringResource(R.string.jetpack_compose_tutorial),
//            shortDescription = stringResource(R.string.compose_short_desc),
//            longDescription = stringResource(R.string.compose_long_desc),
//            imagePainter = painterResource(R.drawable.bg_compose_background),
            modifier = Modifier.fillMaxSize()
        )
    }
}