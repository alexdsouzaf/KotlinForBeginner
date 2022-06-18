package com.example.kotlinforbeginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.util.JsonReader
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import okhttp3.*
import org.json.JSONObject
import java.io.IOException
import java.net.URL
import kotlin.math.log


class MainActivity : AppCompatActivity() {

    private val client = OkHttpClient()

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


        //teste http request | a principio deu certo
        run("https://rickandmortyapi.com/api/character/2")
    }

    fun run(url: String) {
        val request = Request.Builder()
            .url(url)
            .build()
        var resposta : String = ""
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) { resposta ="deu errado" }
            override fun onResponse(call: Call, response: Response) { resposta = response.body!!.string()}
        })
        println(resposta)
        val per = JSONObject(resposta)
        val s = ""
    }
}