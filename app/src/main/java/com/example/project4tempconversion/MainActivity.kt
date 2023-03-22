package com.example.project4tempconversion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.isDigitsOnly
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    private lateinit var inputFahrenheit:EditText
    private lateinit var returnCelsius:TextView
    private lateinit var returnKelvins:TextView
    private lateinit var SUBMIT:Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputFahrenheit = findViewById<EditText?>(R.id.FahrenheitPrompt)
        returnCelsius = findViewById<TextView?>(R.id.CelsiusResults)
        returnKelvins= findViewById<TextView?>(R.id.KelvinResults)
        SUBMIT = findViewById<Button?>(R.id.Submit)

        SUBMIT.setOnClickListener {
            val rawNum = inputFahrenheit.text.toString().toDouble()

            val calcC = Math.round((rawNum - 32) * (5.0/9) * 10.0) / 10.0
            val calcK = calcC + 273.2

            returnCelsius.text = "$calcC°c"
            returnKelvins.text ="$calcK k"
        }
    }
}