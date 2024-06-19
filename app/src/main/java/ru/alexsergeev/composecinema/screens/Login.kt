package ru.alexsergeev.composecinema.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.alexsergeev.composecinema.ui.theme.PinkLight
import ru.alexsergeev.composecinema.ui.theme.Purple40

@Composable
fun Login() {

    val login = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PinkLight),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Вход",
                color = Purple40,
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold
            )
            OutlinedTextField(modifier = Modifier
                .padding(8.dp),
                value = login.value,
                label = {
                        Text(text = "Логин", color = PinkLight)
                },
                shape = CircleShape,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = PinkLight,
                    focusedContainerColor = Purple40,
                    unfocusedTextColor = PinkLight,
                    unfocusedContainerColor = Purple40,
                    cursorColor = Color.White
                ),
                onValueChange = { login.value = it }
            )
            OutlinedTextField(modifier = Modifier
                .padding(8.dp),
                value = password.value,
                label = {
                    Text(text = "Пароль", color = PinkLight)
                },
                shape = CircleShape,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = PinkLight,
                    focusedContainerColor = Purple40,
                    unfocusedTextColor = PinkLight,
                    unfocusedContainerColor = Purple40,
                    cursorColor = Color.White
                ),
                onValueChange = { password.value = it })
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Войти")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Зарегистрироваться")
            }
        }
    }
}