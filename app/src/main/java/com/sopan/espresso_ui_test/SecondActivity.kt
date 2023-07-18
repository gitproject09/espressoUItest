package com.sopan.espresso_ui_test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
class SecondActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val output = findViewById<AppCompatTextView>(R.id.output)
        val message = intent.getStringExtra("KEY")
        output.text = message

    }
}
