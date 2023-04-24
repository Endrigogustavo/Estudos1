package com.example.appdadoo

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val S: EditText = findViewById(R.id.end)
        rollButton.setOnClickListener { rollDice() }
    }

    fun rollDice() {
        val dice = Dice1(6)
        val diceRoll = dice.roll(6)
        val S: EditText = findViewById(R.id.end)
        val txt: TextView = findViewById(R.id.txtname)

        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource =
            when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val num: Int = S.toString().toInt()

        if (num == diceRoll){
            txt.text = "Voce ganhou"
        }
        else{
            txt.text = "Voce Perdeu"
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
    }


}
