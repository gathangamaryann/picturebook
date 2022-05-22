package dev.maryann.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class firstpicturebook : AppCompatActivity() {
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpicturebook)
        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent= Intent(this,secondpicturebook::class.java)
            startActivity(intent)

        }
    }
}