package com.example.a7708210057_kesyanaylakusumaputri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class rating : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rating)

        val btn = findViewById<Button>(R.id.btn) as Button
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar) as RatingBar

        btn.setOnClickListener {
            val getRatingValue = ratingBar.rating
            Toast.makeText(this@rating, "Rating =" + getRatingValue, Toast.LENGTH_LONG).show()
        }
    }
}