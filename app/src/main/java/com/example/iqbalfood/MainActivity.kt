package com.example.iqbalfood


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGetStarted = findViewById<Button>(R.id.btnGetStarted);
        btnGetStarted.setOnClickListener({
            val HomePage = Intent(this, HomeActivity::class.java)
            startActivity(HomePage);
            finish();
        })

    }
}