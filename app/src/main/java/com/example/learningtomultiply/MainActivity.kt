package com.example.learningtomultiply

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val i = Intent(this, Estudiar::class.java)
            startActivity(i)
        }
        butto.setOnClickListener{
            val i = Intent(this, Practicar::class.java)
            startActivity(i)
        }
    }
}