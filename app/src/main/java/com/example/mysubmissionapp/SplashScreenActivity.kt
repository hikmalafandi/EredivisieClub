package com.example.mysubmissionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {
    private val splash_time:Long = 750

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        val imgEredivisie: ImageView = findViewById(R.id.img_eredivisie)

        Handler().postDelayed({
            val i = Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(i)

            finish()
        }, splash_time)
    }
}