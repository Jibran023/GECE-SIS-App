package com.example.doublescreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat

class Options : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_options)

        val attendance_icon = findViewById<LinearLayout>(R.id.attendance_icon)
        val attendance_imageview = findViewById<ImageView>(R.id.attendance_imageview)
        val attendance_text = findViewById<TextView>(R.id.attendance_text)
        attendance_imageview.setOnClickListener {
            Toast.makeText(this, "Attendance Icon was clicked!", Toast.LENGTH_SHORT).show()
            //startActivity()
        }
        attendance_text.setOnClickListener {
            Toast.makeText(this, "Attendance Icon was clicked!", Toast.LENGTH_SHORT).show()
            //startActivity()
        }


        val announcement_icon = findViewById<LinearLayout>(R.id.announcement_icon)
        val announcement_imageview = findViewById<ImageView>(R.id.announcement_viewimage)
        val announcement_text = findViewById<TextView>(R.id.announcement_text)
        announcement_imageview.setOnClickListener {
            Toast.makeText(this, "Announcement Icon was clicked!", Toast.LENGTH_SHORT).show()
            //  startActivity()
        }
        announcement_text.setOnClickListener {
            Toast.makeText(this, "Announcement Icon was clicked!", Toast.LENGTH_SHORT).show()
            // startActivity()
        }


        val complain_icon = findViewById<LinearLayout>(R.id.complain_icon)
        val complain_imageview = findViewById<ImageView>(R.id.complain_imageview)
        val complain_text = findViewById<TextView>(R.id.complain_text)
        complain_imageview.setOnClickListener {
            Toast.makeText(this, "Complain Icon was clicked!", Toast.LENGTH_SHORT).show()
            //  startActivity()
        }
        complain_text.setOnClickListener {
            Toast.makeText(this, "Complain Icon was clicked!", Toast.LENGTH_SHORT).show()
            // startActivity()
        }


        val grades_icon = findViewById<LinearLayout>(R.id.grades_icon)
        val grades_imageview = findViewById<ImageView>(R.id.grades_imageview)
        val grades_text = findViewById<TextView>(R.id.grades_text)
        grades_imageview.setOnClickListener {
            Toast.makeText(this, "Grades Icon was clicked!", Toast.LENGTH_SHORT).show()
            //  startActivity()
        }
        grades_text.setOnClickListener {
            Toast.makeText(this, "Grades Icon was clicked!", Toast.LENGTH_SHORT).show()
            // startActivity()
        }


        val about_icon = findViewById<LinearLayout>(R.id.about_icon)
        val about_imageview = findViewById<ImageView>(R.id.about_imageview)
        val about_text = findViewById<TextView>(R.id.about_text)
        about_imageview.setOnClickListener {
            Toast.makeText(this, "About Icon was clicked!", Toast.LENGTH_SHORT).show()
            //  startActivity()
        }
        about_text.setOnClickListener {
            Toast.makeText(this, "About Icon was clicked!", Toast.LENGTH_SHORT).show()
            // startActivity()
        }


        val policies_icon = findViewById<LinearLayout>(R.id.policies_icon)
        val policies_imageview = findViewById<ImageView>(R.id.policies_imageview)
        val policies_text = findViewById<TextView>(R.id.policies_text)
        policies_imageview.setOnClickListener {
            Toast.makeText(this, "Policies Icon was clicked!", Toast.LENGTH_SHORT).show()
            //  startActivity()
        }
        policies_text.setOnClickListener {
            Toast.makeText(this, "Policies Icon was clicked!", Toast.LENGTH_SHORT).show()
            // startActivity()
        }


        val mainmenu_backbutton = findViewById<Button>(R.id.mainmenuback_button)
        mainmenu_backbutton.setOnClickListener {
            val intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }

    }
}