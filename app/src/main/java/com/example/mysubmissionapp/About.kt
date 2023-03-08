package com.example.mysubmissionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val bar = supportActionBar
        bar?.title = "About"

        val myPhoto: CircleImageView = findViewById(R.id.my_photo)
        val myName: TextView = findViewById(R.id.my_name)
        val myEmail: TextView = findViewById(R.id.my_email)
    }
}