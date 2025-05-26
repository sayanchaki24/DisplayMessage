package com.example.group15mello

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.group15mello.ui.theme.Group15MelloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Group15MelloTheme {
                MessageOnClickApp()
            }
        }
    }
}

@Composable
fun MessageOnClickApp() {
    var messageVisible by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = { messageVisible = true }) {
                Text("Click Me")
            }

            if (messageVisible) {
                Spacer(modifier = Modifier.height(24.dp))
                Text(
                    text = "DONE BY ME",
                    fontSize = 16.sp,
                    lineHeight = 24.sp
                )
            }
        }
    }
}
