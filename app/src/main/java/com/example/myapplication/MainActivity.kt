package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Log.i("MainActibity", "button 1 is clicked")
            Toast.makeText(this, "button 1 is clicked", Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            var msg: String = editText.text.toString()
            Log.i("MainActibity", "button 1 is clicked")
            Toast.makeText(this, "button 2 is clicked", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("msg", msg)

            startActivity(intent)
        }
    }
}
