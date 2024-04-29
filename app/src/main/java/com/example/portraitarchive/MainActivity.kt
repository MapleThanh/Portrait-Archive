package com.example.portraitarchive

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.portraitarchive.ui.theme.PortraitArchiveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortraitArchiveTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ButtonLayout()
                }
            }
        }
    }
}

@Composable
fun ButtonLayout() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /* TODO: Implement action */ }) {
            Text("Button 1")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /* TODO: Implement action */ }) {
            Text("Button 2")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /* TODO: Implement action */ }) {
            Text("Button 3")
        }
    }
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    PortraitArchiveTheme {
        ButtonLayout()
    }
}