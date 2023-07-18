package com.sopan.espresso_ui_test

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.button.MaterialButton

class InputTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        val title = findViewById<AppCompatEditText>(R.id.title)
        val description = findViewById<AppCompatEditText>(R.id.description)
        val submit = findViewById<MaterialButton>(R.id.btnSubmit)

        submit.setOnClickListener {
            val message = "Title - ${title.text} | Desc - ${description.text}"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("KEY", message)
            startActivity(intent)
        }

    }
}