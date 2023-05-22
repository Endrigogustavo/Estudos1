package com.example.genshin


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.genshin.ui.theme.GenshinTheme
import kotlin.text.Typography
import androidx.compose.material.MaterialTheme as MaterialTheme1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GenshinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.background(Blue)

                ) {
                   Scrolling()
                }
            }
        }
    }
}

@Preview
@Composable
fun Scrolling(modifier: Modifier = Modifier) {

    Column(modifier.verticalScroll(rememberScrollState()).background(Color(26, 68, 153, 255))) {
        Column {


        Row(modifier = modifier.horizontalScroll(rememberScrollState())) {
            Image(
                painter = painterResource(R.drawable.nilou),
                contentDescription = "Contact profile picture",
                modifier = Modifier

                    // Set image size to 40 dp
                    .size(411.dp)


            )

            Image(
                painter = painterResource(R.drawable.kakami),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(411.dp)

            )


            Image(
                painter = painterResource(R.drawable.nahida),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(411.dp)

            )


            Image(
                painter = painterResource(R.drawable.yao),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(411.dp)


            )

        }

    }


    Text("               Hyperbloom", fontWeight = FontWeight.Bold, fontSize = 30.sp, color = Color.White, modifier = Modifier .padding(10.dp))
        Text("         é uma reação causada pela aplicação de Electro a um núcleo de Dendro. As composições de equipe baseadas em Hyperbloom  incluem personagens Dendro, Hydro e Electro, muitas vezes com um Anemo ou quarto slot flex. \n\n" +
                "        Hyperbloom cria uma explosão com uma pequena AoE, que às vezes pode danificar o jogador se estiver perto. O dano de hiperbloom é calculado com base no Domínio Elemental do personagem Electro que desencadeia a reação.",
                fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)


        Row(modifier = modifier.horizontalScroll(rememberScrollState())) {
            Image(
                painter = painterResource(R.drawable.nilou11),
                contentDescription = "Contact profile picture",
                modifier = Modifier

                    // Set image size to 40 dp
                    .size(130.dp)


            )

            Image(
                painter = painterResource(R.drawable.kokk),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(130.dp)

            )


            Image(
                painter = painterResource(R.drawable.nahida2),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(130.dp)

            )


            Image(
                painter = painterResource(R.drawable.yao2),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    // Set image size to 40 dp
                    .size(130.dp)

            )

        }

    }
}



fun MaterialTheme(){

    val Red700 = Color(0xffdd0d3c)
    val Red800 = Color(0xffd00036)
    val Red900 = Color(0xffc20029)
}











