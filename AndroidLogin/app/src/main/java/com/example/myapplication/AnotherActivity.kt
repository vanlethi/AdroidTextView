package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_another.*

class AnotherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        var email: String = intent.getStringExtra("Email")
        var pass: String = intent.getStringExtra("Password")
        text_view_email.setText(email)
        text_view_pass.setText(pass)
        var btnReturn = findViewById<Button>(R.id.btnReturn)
        btnReturn.text="Return"
        btnReturn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
