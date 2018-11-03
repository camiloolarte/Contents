package com.cristhian.contents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val texto:TextView = findViewById<TextView>(R.id.dato)

        var dato:String=intent.getStringExtra("dato")

        texto.text=dato
    }
}
