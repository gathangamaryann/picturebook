package dev.maryann.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondpicturebook : AppCompatActivity() {
    lateinit var btnBack:Button
    lateinit var btnNextone:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpicturebook)
        btnBack=findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            var intent= Intent(this,firstpicturebook::class.java)
            startActivity(intent)

        }
        btnNextone=findViewById(R.id.btnNextone)
        btnNextone.setOnClickListener {
            var intent= Intent(this,thirdpicturebook::class.java)
            startActivity(intent)

        }

    }
}