package com.example.android_lab_5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.ColorRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}
@Composable
fun TitleBlock(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Цветовые блоки",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF000000)
        )
        Text(
            text = "Простое приложение на Jetpack Compose",
            fontSize = 18.sp,
            color = Color(0xFF666666),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleBlock()
        ColorRow()
        CombinedBlock()
    }
}

@Composable
fun ColorRow(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ColorBox(color = Color(0x80FF0000))
        ColorBox(color = Color(0xFF00FF00))
        ColorBox(color = Color(0xFF0000FF))
    }
}

@Composable
fun ColorBox(color:Color){
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(color)
    )
}

@Composable
fun CombinedBlock(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .background(Color(0xFFF5F5F5), RoundedCornerShape(8.dp))
            .padding(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Левая колонка", modifier = Modifier.weight(1f))
            Text(text = "Правая колонка", modifier = Modifier.weight(1f))
        }

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Text(text = "Текст 1", modifier = Modifier.weight(1f))
            Text(text = "Текст 2", modifier = Modifier.weight(0.3f))

        }
    }
}
//val symbols = "Hello world!".filter { it.isLetter() }
//Column(
//modifier = Modifier
//.fillMaxSize()
//.padding(8.dp)
//.background(color = Color.Green),
//verticalArrangement = Arrangement.SpaceEvenly,
//horizontalAlignment = Alignment.CenterHorizontally
//){
//    Row(modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly) {
//        for (char in symbols) {
//            Text(
//                modifier = Modifier
//                    .background(color = Color.Green)
//                    .padding(top = 48.dp, start = 15.dp, end = 16.dp)
//                    .width(100.dp),
//                text = char.toString(),
//                fontWeight = FontWeight.ExtraBold,
//                color = Color.Blue,
//                fontSize = 20.sp,
//                letterSpacing = 24.sp
//            )
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//        Row(modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly) {
//            for (char in symbols.reversed()) {
//                Text(
//                    modifier = Modifier
//                        .background(color = Color.Green)
//                        .padding(top = 48.dp, start = 15.dp, end = 16.dp)
//                        .width(100.dp),
//                    text = char.toString(),
//                    fontWeight = FontWeight.ExtraBold,
//                    color = Color.Red,
//                    fontSize = 20.sp,
//                    letterSpacing = 24.sp
//                )
//            }
//        }
//    }
//}
//Column(
//modifier = Modifier
//.fillMaxSize()
//.background(Color.White)
//.padding(16.dp),
//verticalArrangement = Arrangement.SpaceEvenly,
//horizontalAlignment = Alignment.CenterHorizontally
//) {
//    Box(modifier = Modifier
//        .size(100.dp)
//        .background(Color(0xFFFF0000)))
//    Box(modifier = Modifier
//        .size(100.dp)
//        .background(Color(0x80FF0000)))
//}
//            Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = { Text(text = "Scaffold example") }
//                    )
//                },
//                floatingActionButton = {
//                    FloatingActionButton(onClick = { }) {
//                        Text(text = "+")
//                    }
//                }
//            ) { paddingValues ->
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(paddingValues),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(text = "Основное содержимое экрана")
//                }
//            }
