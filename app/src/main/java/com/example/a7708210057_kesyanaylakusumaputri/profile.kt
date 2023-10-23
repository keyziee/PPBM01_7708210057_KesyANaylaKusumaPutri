package com.example.a7708210057_kesyanaylakusumaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val secondActbutton = findViewById<Button>(R.id.hmbtn)
        secondActbutton.setOnClickListener {
            val Intent = Intent(this, sumberdana::class.java)
            startActivity(Intent)
        }
    }
}