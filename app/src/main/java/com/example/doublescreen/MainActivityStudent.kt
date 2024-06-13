package com.example.doublescreen

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivityStudent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_activityk)

//        val stdpolicon = findViewById<LinearLayout>(R.id.studentpoliciesicon)
//        val stdpolimgview = findViewById<ImageView>(R.id.studentpoliciesimgview)
//        val stdpoltext = findViewById<TextView>(R.id.studentpoliciestextview)
//
//        stdpolicon.setOnClickListener {
//            val intent = Intent(this, MainActivityPolicy::class.java)
//            startActivity(intent)
//        }
//        stdpolimgview.setOnClickListener {
//            val intent = Intent(this, MainActivityPolicy::class.java)
//            startActivity(intent)
//        }
//        stdpoltext.setOnClickListener {
//            val intent = Intent(this, MainActivityPolicy::class.java)
//            startActivity(intent)
//        }

    }
}