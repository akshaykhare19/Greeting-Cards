package com.akshay_apps.wishingcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_anniversary.*
import kotlinx.android.synthetic.main.activity_birthday.*

class AnniversaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anniversary)

        val name = intent.getStringExtra(MainActivity.NAME_EXTRA)
        anniversaryGreeting.text = "Happy Anniversary\n$name"
    }
}