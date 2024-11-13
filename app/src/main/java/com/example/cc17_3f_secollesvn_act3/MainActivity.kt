package com.example.cc17_3f_secollesvn_act3

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference to the ImageView and Button in the layout
        val diceImageView: ImageView = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)

        // Set up a click listener for the button
        rollButton.setOnClickListener {
            // Roll the dice and update the image
            rollDice(diceImageView)
        }
    }

    // Function to roll the dice and update the ImageView
    private fun rollDice(diceImageView: ImageView) {
        // Generate a random number between 1 and 6
        val diceRoll = Random.nextInt(1, 7)

        // Determine the correct drawable resource ID based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource
        diceImageView.setImageResource(drawableResource)
    }
}
