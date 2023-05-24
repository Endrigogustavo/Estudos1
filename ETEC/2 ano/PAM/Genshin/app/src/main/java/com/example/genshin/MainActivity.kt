package com.example.genshin


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.genshin.ui.theme.GenshinTheme

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
        Text("Núcleo Dendro\n" +
                "Se a duração de um Dendro Core expirar, ele explodirá, causando AoE Dendro DMG em um raio de 5m para inimigos e jogadores.\n" +
                "\n" +
                "Se Pyro for infligido a um Dendro Core, a reação Burgeon será acionada, que consome o Dendro Core e causa aumento de AoE Dendro DMG em um raio de 5m para inimigos e jogadores.\n" +
                "\n" +
                "Se o Electro for infligido a um Dendro Core, a reação Hyperbloom será acionada, que transforma o Dendro Core em um Sprawling Shot que atinge o inimigo mais próximo (ou aliado, se acionado por um inimigo/ambiente), causando aumento de AoE Dendro DMG em um raio de 1m ao atingir inimigos e jogadores.\n" +
                "\n" +
                "O DMG causado aos jogadores por todas as reações relacionadas a Bloom é de 5% do DMG causado aos inimigos, não importa qual parte desencadeie a reação.\n" +
                "\n" +
                "Burgeon e Hyperbloom podem ser ativados por um grupo diferente daquele que ativou o Bloom original, incluindo o ambiente e sua escala de dano com as estatísticas do responsável pela aplicação de Pyro ou Electro.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)

        
        Text("núcleo abundante\n" +
                "Certas habilidades de personagem e buffs de eventos farão com que a reação de Bloom produza núcleos abundantes em vez de núcleos Dendro. Bountiful Cores explodem 0,4 segundos após sua criação, causando AoE Dendro DMG em um raio de 6,5 m para inimigos e jogadores. DMG dado aos jogadores é 5% do DMG dado aos inimigos.\n" +
                "\n" +
                "Burgeon e Hyperbloom não podem ser acionados em Bountiful Cores. Bountiful Cores compartilham o limite superior de 5 com Dendro Cores regulares." +
                "" +
                "Dano\n" +
                "Observe que um alvo pode receber apenas 2 instâncias de DMG de cada reação relacionada a Bloom a cada 0,5 segundos, conforme limitado pela Sequência de Dano . Observe que as explosões do Dendro Core e as explosões do Bountiful Core também são contadas separadamente.\n" +
                "\n" +
                "Florescer\n" +
                "Bloom DMG é calculado como\n" +
                "2\n" +
                "×\n" +
                "Multiplicador de Nível\n" +
                "{\\displaystyle 2\\vezes {\\text{Nível Multiplicador}}}. Os multiplicadores de nível para cada nível podem ser encontrados em Level Scaling/Reaction#Level Multiplier .\n" +
                "\n" +
                "Bloom DMG é afetado apenas pelo nível e Maestria Elemental do personagem que está causando a reação, e o Dendro RES do alvo . Ele ignora a DEF do alvo e não pode causar Golpes Críticos . O Elemental Mastery DMG Bonus e o multiplicador de Resistência do alvo são aplicados multiplicativamente com o Base DMG.",
            fontWeight = FontWeight.Bold, fontSize = 13.sp,color = Color.White, modifier = Modifier .padding(20.dp),)



    }




}











