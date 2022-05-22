package dev.maryann.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fifthpicturebook : AppCompatActivity() {
    lateinit var btnBackthree:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifthpicturebook)
        btnBackthree=findViewById(R.id.btnBackthree)
        btnBackthree.setOnClickListener {
            var intent= Intent(this,fourthpicturebook::class.java)
            startActivity(intent)

        }

    }
}