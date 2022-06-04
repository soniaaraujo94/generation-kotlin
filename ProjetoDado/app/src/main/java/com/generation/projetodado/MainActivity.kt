package com.generation.projetodado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button6 = findViewById<Button>(R.id.button6)
        val button12 = findViewById<Button>(R.id.button12)
        val button20 = findViewById<Button>(R.id.button20)

        button6.setOnClickListener {
            rolarDados(6)
        }

        button12.setOnClickListener {
            rolarDados(12)
        }

        button20.setOnClickListener {
            rolarDados(20)
        }
    }

    private fun rolarDados(lados: Int) {
        val rolagem = (1..lados).random()

        val num = findViewById<TextView>(R.id.num)

        num.text = rolagem.toString()

    }
}