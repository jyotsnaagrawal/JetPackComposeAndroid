package com.jyotsna.jetpack

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext
import com.jyotsna.jetpack.ui.theme.JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTheme {
                ItemListScreen()
            }
        }
    }
}

@Composable
fun ItemListScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(86.dp)
    ) {
        Button(
            onClick = {
                val intent = Intent(context, ItemDetailActivity::class.java)
                intent.putExtra("Name", "Jyotsna")
                intent.putExtra("Last", "Agrawal")
                context.startActivity(intent)
            },
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text("Show Full Name")
        }
    }
}
