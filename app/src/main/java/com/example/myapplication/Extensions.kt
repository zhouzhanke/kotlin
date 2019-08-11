package com.example.myapplication

import android.content.Context
import android.widget.Toast
import java.time.Duration

fun Context.popUP(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, msg, duration).show()
}