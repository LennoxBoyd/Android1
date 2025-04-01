package com.lennox.boyd.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lennox.boyd.R
@Composable
fun Homescreen(modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Top){
        Text("Boyd app",
            color = Color.Blue,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif
        )
        Image(painter = painterResource(id= R.drawable.pixels),
        contentDescription="Car Image", modifier = Modifier
                .fillMaxSize()
                .height(200.dp)
        )
        Spacer(modifier = Modifier)
        Button(onClick = {/*1000*/},
            modifier=Modifier.width(200.dp)) {
            Text(
                "login",
                fontSize = 30.sp
            )

        }
    }
}



@Preview(showBackground =true )
@Composable
private fun Homepre() {
    Homescreen()

}
