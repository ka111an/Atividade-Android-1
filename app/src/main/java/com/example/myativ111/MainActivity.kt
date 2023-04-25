package com.example.myativ111

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myativ111.ui.theme.Myativ111Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Myativ111Theme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        Text(text = "Olá $name!")
        val (textValue, setTextValue) = remember { mutableStateOf("") }
        TextField(
            value = textValue,
            onValueChange = { newValue ->
                setTextValue(newValue)
            },
            label = { Text("Digite qualquer coisas menos felipeg4y pois algo sombrio acontecerá") }
        )
        if (textValue == "felipeg4y") {
            CongratulationsMessage()
        }
    }
}

@Composable
fun CongratulationsMessage() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF6A1B9A)
    ) {
        Text(
            text = "Tutorial de como eu conheci um cara andrógeno quando tava no colégio. Ele é um dos caras mais valentes que eu já conheci. Pink Bobby Jenkins. Ele era andrógino muito antes disso virar moda. Todo mundo tirava onda com ele. Aí um dia eu estava voltando pra casa da escola e uns caras me pegaram, me pegaram pra valer. Mas no meio da confusão, lá vem o Pink Bobby. Caramba! Pou pou, Pink Bobby deu uma surra naqueles caras. Eu perguntei por que ele me ajudou, já que eu não falava com ele... E ele disse que não se importava com essas coisas. Mas é porque eu nunca falei mal dele. E depois disso, ficamos amigos.",
            color = Color.White,
            modifier = Modifier.fillMaxSize()
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Myativ111Theme {
        Greeting("alguém mas provavelmente o Felipe")
    }
}
