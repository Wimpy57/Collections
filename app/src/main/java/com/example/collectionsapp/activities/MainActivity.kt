package com.example.collectionsapp.activities

import android.os.Bundle
import com.example.collectionsapp.MenuActivity
import com.example.collectionsapp.R

class MainActivity : MenuActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}