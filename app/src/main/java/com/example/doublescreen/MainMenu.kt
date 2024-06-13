//package com.example.doublescreen
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import android.widget.Toast
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
////import androidx.core.view.ViewCompat
////import androidx.core.view.WindowInsetsCompat
//
//class MainMenu : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//
//
//
//        student_button.setOnClickListener {
//            Toast.makeText(this, "Student Button was clicked!", Toast.LENGTH_SHORT).show()
//            val intent = Intent(this, MainActivity::class.java) // This will take us to the screen/activity 'Options'
//            startActivity(intent)
//        }
//
//    }
//}
package com.example.doublescreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.doublescreen.MainActivity
import com.example.doublescreen.R

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        // Reference the student button
        val studentButton: Button = findViewById(R.id.student_button)

        // Set an OnClickListener
        studentButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
