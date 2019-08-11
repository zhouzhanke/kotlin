package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("msg")


        textView.text = msg
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
