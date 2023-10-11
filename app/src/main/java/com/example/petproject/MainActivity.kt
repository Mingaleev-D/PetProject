package com.example.petproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.petproject.ui.theme.PetProjectTheme

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {
         PetProjectTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
               Greeting()
            }
         }
      }
   }
}

@Composable
fun Greeting() {

   var nameState by remember { mutableStateOf("") }
   var name by remember { mutableStateOf("") }

   Column(
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier = Modifier.fillMaxSize(),
       verticalArrangement = Arrangement.Center
   ) {

      Text(text = "hello $name")

      TextField(
          value = nameState,
          onValueChange = {
             nameState = it
          }
      )

      Spacer(modifier = Modifier.height(10.dp))

      Button(onClick = { name = nameState }) {
         Text(text = "Display")
      }
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   PetProjectTheme {
      Greeting()
   }
}