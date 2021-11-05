package com.nepplus.viewpagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.viewpagerpractice.Adapters.ViewPagerAdapters


class MainActivity : AppCompatActivity() {

    lateinit var mnpa: ViewPagerAdapters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpEvent()
        setValues()
    }
}

    fun setUpEvent() {}

    fun setValues() {

        mnpa 
    }

