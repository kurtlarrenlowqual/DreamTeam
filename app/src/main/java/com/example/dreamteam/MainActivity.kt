package com.example.dreamteam

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStudent1 = findViewById<Button>(R.id.btnStudent1)

        btnStudent1.setOnClickListener {
            val intent = Intent(this, StudentOneActivity::class.java)
            startActivity(intent)
        }
        val btnStudent2 = findViewById<Button>(R.id.btnStudent2)

        btnStudent2.setOnClickListener {
            val intent = Intent(this, StudentTwoActivity::class.java)
            startActivity(intent)
        }
        val btnStudent3 = findViewById<Button>(R.id.btnStudent3)

        btnStudent3.setOnClickListener {
            val intent = Intent(this, StudentThreeActivity::class.java)
            startActivity(intent)
        }
        val btnStudent4 = findViewById<Button>(R.id.btnStudent4)

        btnStudent4.setOnClickListener {
            val intent = Intent(this, StudentFourActivity::class.java)
            startActivity(intent)
        }
        val btnStudent5 = findViewById<Button>(R.id.btnStudent5)

        btnStudent5.setOnClickListener {
            val intent = Intent(this, StudentFiveActivity::class.java)
            startActivity(intent)
        }


    }
}
