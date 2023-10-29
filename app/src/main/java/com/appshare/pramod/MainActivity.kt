package com.appshare.pramod

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var shareButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        shareButton = findViewById(R.id.share)

        shareButton.setOnClickListener {
            sharelink()
        }



    }

    private fun sharelink() {

        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_SUBJECT,"Consltancy")
        intent.putExtra(Intent.EXTRA_TEXT,"http://location.com")
        startActivity(Intent.createChooser(intent,"Share via"))

    }
}