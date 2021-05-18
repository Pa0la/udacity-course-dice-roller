package com.paola.udacitycourse.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.paola.udacitycourse.diceroller.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mBinding.root
        setContentView(view)
        mBinding.rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val drawableResourceId = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        mBinding.diceImage.setImageResource(drawableResourceId)

    }
}