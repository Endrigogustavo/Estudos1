package com.example.appdadoo

    class Dice1( val numSides: Int) {

            fun roll(numSides: Int): Int {
                return (1..numSides).random()

            }
        }

