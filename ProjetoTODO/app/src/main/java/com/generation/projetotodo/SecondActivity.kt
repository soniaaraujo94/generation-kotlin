package com.generation.projetotodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonVoltar = findViewById<Button>(R.id.buttonBack)

        buttonVoltar.setOnClickListener{
            finish()
        }
    }
}