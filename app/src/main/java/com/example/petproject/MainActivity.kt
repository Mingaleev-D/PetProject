package com.example.petproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.petproject.ui.components.ProfileScreen
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
               ProfileScreen()
               // Greeting(name = "Android")
            }
         }
      }
   }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//   Text(
//       text = "Hello $name!",
//       modifier = modifier
//   )
//}

@Composable
fun MyApp() {
   Text(
       text = "Android Welcome Compose",
       fontSize = 30.sp
   )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   PetProjectTheme {
      MyApp()
   }
}