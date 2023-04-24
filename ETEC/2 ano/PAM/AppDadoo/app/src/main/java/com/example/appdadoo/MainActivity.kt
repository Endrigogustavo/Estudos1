package com.example.appdadoo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val btnRoll: Button = findViewById(R.id.btnRoll)

            btnRoll.setOnClickListener {
                rollDice()
            }

        }

        private fun rollDice() {


            val diceRoll = (1..6).random()
            val diceImage: ImageView = findViewById(R.id.imgDice)

            val drawableResource = when (diceRoll) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(drawableResource)

            val txtNum: TextView = findViewById(R.id.txtNum)
            val txtRes: TextView = findViewById(R.id.txtRes)
            var SortNum: EditText = findViewById(R.id.SortNum)

            txtNum.text = diceRoll.toString()

            if (diceRoll == SortNum.text.toString().toInt()) {
                Toast.makeText(this, "Ganhou!!!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Perdeu!!!", Toast.LENGTH_SHORT).show()
            }

        }

    }
}