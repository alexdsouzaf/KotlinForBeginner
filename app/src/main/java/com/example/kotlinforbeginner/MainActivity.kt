package com.example.kotlinforbeginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnExemplo)
        val txtView = findViewById<TextView>(R.id.txtViewContador)
        val lblOutraLabel = findViewById<TextView>(R.id.lblOutraLabel)
        lblOutraLabel.text = "alterado via código"
        btn.setOnClickListener{
            Toast.makeText(this@MainActivity, "Clicado", Toast.LENGTH_SHORT).show()
        }
    }
}