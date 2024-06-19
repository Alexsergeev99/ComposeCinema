package ru.alexsergeev.composecinema

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ru.alexsergeev.composecinema.screens.Login
import ru.alexsergeev.composecinema.ui.theme.ComposeCinemaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            ComposeCinemaTheme {
                Login()
            }
        }
    }
}
