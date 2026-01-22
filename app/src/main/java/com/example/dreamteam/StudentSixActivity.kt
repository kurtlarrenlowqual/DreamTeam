package com.example.dreamteam;

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button

class StudentSixActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_six)

        val btnBack = findViewById<Button>(R.id.btnBack)
                btnBack.setOnClickListener {
            finish()
        }
    }
}
