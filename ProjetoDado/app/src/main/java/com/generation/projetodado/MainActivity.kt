package com.generation.projetodado

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        } catch (e: NullPointerException) {
        }
        setContentView(R.layout.activity_main)

        val button6 = findViewById<ImageButton>(R.id.dado6)

        val intendSegunda = Intent(this, SecondActivity::class.java)

        button6.setOnClickListener {
            startActivity(intendSegunda)
        }

        val button12 = findViewById<ImageButton>(R.id.dado12)

        val intendTerceira = Intent(this, ThirdActivity::class.java)

        button12.setOnClickListener {
            startActivity(intendTerceira)
        }

        val button20 = findViewById<ImageButton>(R.id.dado20)

        val intendQuarta = Intent(this, FourthActivity::class.java)

        button20.setOnClickListener {
            startActivity(intendQuarta)

        }


/*
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        */
/*
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
*/
    }
}