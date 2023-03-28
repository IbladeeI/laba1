package com.example.laba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textview: TextView = findViewById(R.id.textview) as TextView;
        var button1: Button = findViewById(R.id.button1) as Button;

        button1.setOnClickListener{
            var uptext: EditText = findViewById(R.id.edit1) as EditText;
            textview.setText(uptext.text.toString());
        }

    }
}