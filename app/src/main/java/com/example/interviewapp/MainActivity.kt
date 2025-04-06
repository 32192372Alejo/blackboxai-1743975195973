package com.example.interviewapp

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startSimulationButton: Button = findViewById(R.id.startSimulationButton)
        val faqText: Button = findViewById(R.id.faqText)

        startSimulationButton.setOnClickListener {
            Toast.makeText(this, "Simulación iniciada", Toast.LENGTH_SHORT).show()
        }

        faqText.setOnClickListener {
            Toast.makeText(this, "Preguntas frecuentes", Toast.LENGTH_SHORT).show()
        }
    }
}