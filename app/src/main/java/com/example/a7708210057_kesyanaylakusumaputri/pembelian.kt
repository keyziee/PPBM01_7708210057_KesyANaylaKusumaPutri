package com.example.a7708210057_kesyanaylakusumaputri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class pembelian : AppCompatActivity() {

    private lateinit var list: Spinner
    private lateinit var btn_pilih: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembelian)
        list = findViewById(R.id.list_makanan)
        btn_pilih = findViewById(R.id.btn_pilih)

        btn_pilih.setOnClickListener {
            val toast =
                Toast.makeText(this, "kamu memilih! ${list.selectedItem}", Toast.LENGTH_SHORT)
            toast.show()

            val secondActbutton = findViewById<Button>(R.id.belibutton)
            secondActbutton.setOnClickListener {
                val Intent = Intent(this, donebelanja::class.java)
                startActivity(Intent)
            }
        }
    }
}