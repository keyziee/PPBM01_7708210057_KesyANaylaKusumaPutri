package com.example.a7708210057_kesyanaylakusumaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class donebelanja : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donebelanja)

        val secondActbutton = findViewById<Button>(R.id.dvbutton)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, myprofile::class.java)
            startActivity(Intent)
        }
    }
}