package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnChangeScreen = findViewById<Button>(R.id.btnLogin)
        btnChangeScreen.text="Login"
        btnChangeScreen.setOnClickListener{
            val intent = Intent(this, AnotherActivity::class.java)
            var txtemail = edit_text_email.text.toString()
            var password = edit_text_password.text.toString()
            intent.putExtra("Email", txtemail)
            intent.putExtra("Password", password)
            // start your next activity
            startActivity(intent)
        }
        var btntoWebpage = findViewById<Button>(R.id.btntoWebpage)
        btntoWebpage.text="Go to webpage"
        btntoWebpage.setOnClickListener{
            val openUrl = Intent(android.content.Intent.ACTION_VIEW)
            openUrl.data = Uri.parse("https://vi-vn.facebook.com/")
            startActivity(openUrl)
        }
    }
}
