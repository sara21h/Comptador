package me.sarabogdan.dam.comptador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    internal lateinit var tapMeButton : Button
    internal lateinit var counterTextView : TextView
    internal lateinit var timeTextView : TextView
    internal var counter = 0
    internal var time = 60
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapMeButton = findViewById(R.id.tapMeButton)
        timeTextView = findViewById(R.id.timeTextView)
        counterTextView = findViewById(R.id.counterTextView)

        //TODO en algun moment haurem d'executar aquesta funció
        tapMeButton.setOnClickListener{
            incrementCounter()
        }

        timeTextView.text = getString(R.string.timeText, time)
    }
    private fun incrementCounter(){
        counter += 1
        counterTextView.text = counter.toString()
    }
}