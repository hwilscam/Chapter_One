package com.example.chapter_two

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton : Button
    private lateinit var falseButton : Button

    private val questionBank = listOf(

    Question(R.string.question_australia, true),
    Question(R.string.question_oceans, true),
    Question(R.string.question_mideast, false),
    Question(R.string.question_africa, false),
    Question(R.string.question_americas, true),
    Question(R.string.question_asia, true)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener {
            Snackbar.make(
                it,
                R.string.correct_toast,
                Snackbar.LENGTH_LONG
                )
                .show()
        }

        falseButton.setOnClickListener {
            Snackbar.make(
                it,
                R.string.incorrect_toast,
                Snackbar.LENGTH_LONG
            )
                .show()
        }
    }
}