package com.example.mad_lab_exam_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Categories_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val btnNavigate: Button = findViewById(R.id.back)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Home_Activity::class.java)
            startActivity(intent)
        }
    }
}