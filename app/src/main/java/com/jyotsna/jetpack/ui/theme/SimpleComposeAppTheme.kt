package com.jyotsna.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.jyotsna.jetpack.ui.theme.JetpackTheme

class ItemDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTheme {
                ItemDetailScreen(
                    itemName = intent.getStringExtra("Name") ?: "No Name",
                    itemName1 = intent.getStringExtra("Last") ?: "No Last Name",
                    onBack = { finish() } // Call finish() when the button is clicked
                )
            }
        }
    }
}

@Composable
fun ItemDetailScreen(itemName: String, itemName1: String, onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Your Name is $itemName", modifier = Modifier.padding(bottom = 16.dp))
        Text(text = "Your Last Name is $itemName1", modifier = Modifier.padding(bottom = 16.dp))

        Button(onClick = { onBack() }) {
            Text(text = "Go Back")
        }
    }
}
