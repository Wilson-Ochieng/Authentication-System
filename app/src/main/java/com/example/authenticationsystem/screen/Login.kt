package com.example.authenticationsystem.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.authenticationsystem.R
import com.google.firebase.auth.FirebaseAuth

@Composable

fun LoginPage() {

    var auth = FirebaseAuth.getInstance()

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center


    ) {  Card() {

    }

        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(8.dp)


        ) {


            Column(modifier = Modifier

                .padding(16.dp)
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = "Login",
                    color = MaterialTheme.colorScheme.primary,
                    fontSize = 18.sp


                )

                Spacer(modifier = Modifier.height(15.dp))

                Image(painter = painterResource(R.drawable.person_1824144_640), contentDescription = "Login Image" )

                Spacer(modifier = Modifier.height(15.dp))

                TextField(value = email,
                    singleLine = true,
                    label = {Text(text ="Email" )},
                    onValueChange = { email = it
                    })

                Spacer(modifier = Modifier.height(15.dp))

                TextField(value = password,
                    label = {Text(text ="Password" )},
                    singleLine = true,
                    onValueChange = { password = it })

                Spacer(modifier = Modifier.height(15.dp))


                Button(onClick = { /*TODO*/ }) {

                }

            }


        }

    }


}


fun SignIn(email: String, password: String) {


}