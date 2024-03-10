package com.example.mad_lab_exam_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNavigate: Button = findViewById(R.id.btn_navto_welcome1)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Welcome_01Activity::class.java)
            startActivity(intent)
        }

    }

    
}