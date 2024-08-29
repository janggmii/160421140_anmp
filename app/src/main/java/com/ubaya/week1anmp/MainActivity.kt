package com.ubaya.week1anmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()
        Log.d("resume","app is starting")
    }

    override fun onDestroy() {
        Log.d("destroy", "app is closing")
        super.onDestroy()
    }
}