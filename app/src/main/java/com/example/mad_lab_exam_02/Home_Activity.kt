package com.example.mad_lab_exam_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.navigation_home
        bottomNav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {

                    val intent = Intent(this, Home_Activity::class.java)
                    startActivity(intent)

                    true
                }
                R.id.navigation_explore -> {
                    val intent = Intent(this, Explore_Activity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_notifications -> {
                    val intent = Intent(this, Notifications_Activity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.navigation_profile -> {
                    val intent = Intent(this, Profile_Activity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }

        val btnNavigate: Button = findViewById(R.id.seeallfeatured)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, Featured_Activity::class.java)
            startActivity(intent)
        }

        val btnNavigate2: Button = findViewById(R.id.seeallrecommended)
        btnNavigate2.setOnClickListener {
            val intent = Intent(this, Recommended_Activity::class.java)
            startActivity(intent)
        }

        val btnNavigate3: Button = findViewById(R.id.seeallcategories)
        btnNavigate3.setOnClickListener {
            val intent = Intent(this, Categories_Activity::class.java)
            startActivity(intent)
        }

    }
}