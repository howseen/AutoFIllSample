package com.example.autofillsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var etPhone: EditText
    lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        etPhone = findViewById(R.id.etPhone)
        etPassword = findViewById(R.id.etPassword)

        button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            finish()
        }
    }
}