package com.example.tut91

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonutube = findViewById<Button>(R.id.button1)
        val buttonInstagram = findViewById<Button>(R.id.button2)
        val buttonweb = findViewById<Button>(R.id.button3)

        buttonutube.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.youtube.com/")
            startActivity(intent)
        }
        buttonInstagram.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com/")
            startActivity(intent)
        }

        buttonweb.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data  = Uri.parse("https://developer.android.com/guide/components/activities/activity-lifecycle")
            startActivity(intent)
        }
    }
}