package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Log.i(TAG, "button 1 is clicked")
            popUP(resources.getString(R.string.button_click))
        }

        button2.setOnClickListener {
            Log.i(TAG, "button 2 is clicked")
            var msg: String = editText.text.toString()

            val intent = Intent(this, Main2Activity::class.java)

            intent.putExtra(Constants.USER_MSG_KEY, msg)

            startActivity(intent)
        }

        button3.setOnClickListener {
            Log.i(TAG, "button 3 is clicked")
            var msg: String = editText.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, msg)
            intent.type = "text/plan"

            startActivity(Intent.createChooser(intent, "share to : "))
        }

        button4.setOnClickListener {
            Log.i(TAG, "button 4 is clicked")

            val intent = Intent(this, Main3Activity::class.java)
            startActivity(intent)
        }
    }
}
