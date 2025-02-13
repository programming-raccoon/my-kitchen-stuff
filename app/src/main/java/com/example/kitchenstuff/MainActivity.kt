package com.example.kitchenstuff

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kitchenstuff.ui.theme.KitchenStuffTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KitchenStuffTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    groceryList("Patata")
                    itemDueDate("patata", "13/09/26")
                }
            }
        }
    }
}

// Test
@Composable
fun groceryList(name: String) {
    Text(text = "Lista de la compra")
}

fun itemDueDate (name: String, date: String) { // TODO cambiar esto a date: due date
    Text(text = "Fecha de caducidad")
}