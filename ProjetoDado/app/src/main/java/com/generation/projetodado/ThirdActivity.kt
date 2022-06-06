package com.generation.projetodado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_third)

        val button12 = findViewById<Button>(R.id.jogar)
        button12.setOnClickListener {
            rolarDados(12)
        }
    }

    private fun rolarDados(lados: Int) {
        val rolagem = (1..lados).random()

        val num = findViewById<TextView>(R.id.textDado)

        num.text = rolagem.toString()
    }
}