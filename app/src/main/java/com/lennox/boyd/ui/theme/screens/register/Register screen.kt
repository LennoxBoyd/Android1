package com.lennox.boyd.ui.theme.screens.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.lennox.boyd.navigation.ROUTE_HOME
import com.lennox.boyd.navigation.ROUTE_REGISTER

@Composable
fun Register_screen(navController: NavController) {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var FirstName by remember { mutableStateOf(TextFieldValue("")) }
    var SecondName by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {
        Text(
            "Register Here",
            fontSize = 35.sp,
            color = Color.Red,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedTextField(
            value = FirstName,
            onValueChange = { FirstName = it },
            label = { Text(text = "Enter First Name") },
            leadingIcon = { },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)

            )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = SecondName,
            onValueChange = { SecondName = it },
            label = { Text(text = "Enter Second Name") },
            leadingIcon = { },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)

            )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter Email") },
            leadingIcon = { },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)

            )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Enter Password") },
            leadingIcon = { },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.padding(16.dp)

        )
        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier.width(300.dp)
                               .padding(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue)){
            Text("Register",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif                )

        }


    }
}

@Preview(showBackground = true)
@Composable
private fun Register_page() {
    Register_screen(rememberNavController())

}

