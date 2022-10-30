package com.example.iqbalfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val foodGyoza = findViewById<LinearLayout>(R.id.foodGyoza);
        foodGyoza.setOnClickListener({
            val DetailsPage = Intent(this, DetailsActivity::class.java)
            startActivity(DetailsPage);
        })


    }
}