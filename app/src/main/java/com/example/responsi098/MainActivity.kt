package com.example.responsi098

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val username: String = "pacul"
    val password: String = "pacul12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            if((txtUsername.text.toString().equals(username)) && (txtPassword.text.toString().equals(password))){
                startActivity(Intent(this@MainActivity, Home::class.java))
            }else{
                Toast.makeText(this, "Username atau Password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
