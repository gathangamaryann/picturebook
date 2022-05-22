package dev.maryann.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
     lateinit var btnDarkacademia:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDarkacademia=findViewById(R.id.btnDarkacademia)
        btnDarkacademia.setOnClickListener {
            var intent=Intent(this,firstpicturebook::class.java)
            startActivity(intent)

        }
    }
}