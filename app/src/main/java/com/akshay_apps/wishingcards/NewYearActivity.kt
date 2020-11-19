package com.akshay_apps.wishingcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_anniversary.*
import kotlinx.android.synthetic.main.activity_new_year.*

class NewYearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_year)

        val name = intent.getStringExtra(MainActivity.NAME_EXTRA)
        newYearGreeting.text = "Happy New Year\n$name"
    }
}