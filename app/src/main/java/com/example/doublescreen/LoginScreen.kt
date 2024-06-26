package com.example.doublescreen


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.doublescreen.databinding.ActivityMainBinding

//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat

class LoginScreen : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loginbtn : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


//        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)

        val loginbtn = findViewById<Button>(R.id.loginbutton)
        loginbtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Test Credentials", "Username, $username and Password : $password")

            val intent = Intent(this, MainActivityk::class.java)
            startActivity(intent)
        }


//        val backbtn_loginscrn = findViewById<Button>(R.id.login_back_button)
//        backbtn_loginscrn.setOnClickListener {
//            val intent = Intent(this, MainMenu::class.java)
//            startActivity(intent)
//        }

    }
}