package com.generation.projetotodo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo", "Create")

        val buttonNext = findViewById<Button>(R.id.buttonNext)

        val intentSegunda = Intent(this, SecondActivity::class.java)

        buttonNext.setOnClickListener{
            startActivity(intentSegunda)
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d("Ciclo", "Start")
    }

    override fun onResume(){
        super.onResume()
        Log.d("Ciclo", "Resume")
    }

    override fun onPause(){
        super.onPause()
        Log.d("Ciclo", "Pause")
    }

    override fun onStop(){
        super.onStop()
        Log.d("Ciclo", "Stop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d("Ciclo", "Destroy")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d("Ciclo", "Restart")
    }


}