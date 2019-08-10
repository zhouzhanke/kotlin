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
        }

        button2.setOnClickListener {
            var msg: String = editText.text.toString()
            Log.i("MainActibity", "button 1 is clicked")

            val intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("msg", msg)

            startActivity(intent)
        }

        button3.setOnClickListener {
            var msg: String = editText.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, msg)
            intent.type = "text/plan"

            startActivity(Intent.createChooser(intent, "share to : "))
        }
    }
}
