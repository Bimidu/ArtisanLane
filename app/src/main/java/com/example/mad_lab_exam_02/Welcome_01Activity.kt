package com.example.mad_lab_exam_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome_01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome01)

        val btnNavigate: Button = findViewById(R.id.button1)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Welcome_02Activity::class.java)
            startActivity(intent)
        }
    }


    
}