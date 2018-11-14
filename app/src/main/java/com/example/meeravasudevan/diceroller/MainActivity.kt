package com.example.meeravasudevan.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()

        resultText.text = randomInt.toString()
    }
}
