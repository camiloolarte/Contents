package com.cristhian.contents

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton:Button = findViewById(R.id.boton)
        val edittext:EditText = findViewById(R.id.edittext)

        boton.setOnClickListener(){
            var intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("dato",edittext.text.toString())
            startActivity(intent)
        }
    }
}
