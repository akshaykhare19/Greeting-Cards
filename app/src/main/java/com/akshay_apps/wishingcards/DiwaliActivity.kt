package com.akshay_apps.wishingcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_anniversary.*
import kotlinx.android.synthetic.main.activity_diwali.*

class DiwaliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diwali)

        val name = intent.getStringExtra(MainActivity.NAME_EXTRA)
        diwaliGreeting.text = "Happy Diwali\n$name"
    }
}