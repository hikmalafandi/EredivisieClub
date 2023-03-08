package com.example.mysubmissionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class DetailClub : AppCompatActivity() {
    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESKRIPSI = "extra_deskripsi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_club)
        val bar = supportActionBar
        bar?.title = "Detail Club"


        val namaClub: TextView = findViewById(R.id.data_name)
        val photoClub: ImageView = findViewById(R.id.data_photo)
        val deskripsiClub: TextView = findViewById(R.id.description)


        val nama = intent.getStringExtra(EXTRA_NAME)
        val Img = intent.getIntExtra(EXTRA_PHOTO, 0)
        val deskripsi = intent.getStringExtra(EXTRA_DESKRIPSI)

        namaClub.text = nama
        photoClub.setImageResource(Img)
        deskripsiClub.text = deskripsi

        val btnShare : Button = findViewById(R.id.btn_share)

        btnShare.setOnClickListener{
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                putExtra(DetailClub.EXTRA_NAME, nama)
                putExtra(DetailClub.EXTRA_PHOTO, Img)
                putExtra(DetailClub.EXTRA_DESKRIPSI, deskripsi)
            }
            startActivity(Intent.createChooser(shareIntent, "Bagikan melalui"))
        }

    }
}