package dev.maryann.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class thirdpicturebook : AppCompatActivity() {
     lateinit var btnBackone: Button
    lateinit var btnNexttwo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirdpicturebook)
        btnBackone=findViewById(R.id.btnBackone)
        btnBackone.setOnClickListener {
            var intent= Intent(this,secondpicturebook::class.java)
            startActivity(intent)

        }
        btnNexttwo=findViewById(R.id.btnNexttwo)
        btnNexttwo.setOnClickListener {
            var intent= Intent(this,fourthpicturebook::class.java)
            startActivity(intent)

        }
    }
}