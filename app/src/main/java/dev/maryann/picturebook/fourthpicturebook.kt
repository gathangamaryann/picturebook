package dev.maryann.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourthpicturebook : AppCompatActivity() {
    lateinit var btnBacktwo: Button
    lateinit var btnNextthree: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourthpicturebook)
        btnBacktwo=findViewById(R.id.btnBacktwo)
        btnBacktwo.setOnClickListener {
            var intent= Intent(this,thirdpicturebook::class.java)
            startActivity(intent)

        }
        btnNextthree=findViewById(R.id.btnNextthree)
        btnNextthree.setOnClickListener {
            var intent= Intent(this,fifthpicturebook::class.java)
            startActivity(intent)

        }
    }
}