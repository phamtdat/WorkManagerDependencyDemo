package com.example.workmanagerdependencydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.WorkManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WorkManager.getInstance(this)
    }
}