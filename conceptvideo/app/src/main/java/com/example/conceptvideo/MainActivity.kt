package com.example.conceptvideo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "OnCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        Toast.makeText(applicationContext, "OnStart", Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(applicationContext, "OnResume", Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(applicationContext, "OnPause", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(applicationContext, "OnStop", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroy() {
        Toast.makeText(applicationContext, "OnDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onRestart() {
        Toast.makeText(applicationContext, "OnRestart", Toast.LENGTH_SHORT).show()
        super.onRestart()
    }
}