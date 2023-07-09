package com.mad.myapplication.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import com.mad.myapplication.R
import com.mad.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startService.setOnClickListener{
            Toast.makeText(this, "Start the service clicked", Toast.LENGTH_SHORT).show()
          startService(Intent(this, NewService::class.java))
        }

        binding.stopService.setOnClickListener{
            Toast.makeText(this, "Stop the service clicked", Toast.LENGTH_SHORT).show()
            stopService(Intent(this, NewService::class.java))
        }
    }
}
