package com.example.wbutton.kotlincalc

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.RadioButton

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        calculate.setOnClickListener { view ->
            val number1 = number1.text.toString()
            val number2 = number2.text.toString()
            val operation = operations
            val selectedOperation = operation.checkedRadioButtonId

            val radio: RadioButton = findViewById(selectedOperation)

            val answer: Float
            if (radio.text == "Add")
            // answer = number1.toFloat() + number2.toFloat()
                answer = number1.toFloat().plus(number2.toFloat())
            else
                answer = number1.toFloat() - number2.toFloat()

            results.setText(answer.toString())

        }

    }
}
