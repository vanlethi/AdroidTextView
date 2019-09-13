package com.example.androidbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnSubmit = findViewById<Button>(R.id.btnSubmit)
        btnSubmit.text = "Submit"
        btnSubmit.setOnClickListener{
            btnSubmit.text = "Cancel"
           val alert = AlertDialog.Builder(this)
               .setTitle("Ahihi")
               .show()
            btnSubmit.setBackgroundColor(getResources().getColor(R.color.colorCancel))
        }
    }

}
