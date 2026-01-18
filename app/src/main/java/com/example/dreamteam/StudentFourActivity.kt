package com.example.dreamteam

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button

class StudentFourActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_four)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}
