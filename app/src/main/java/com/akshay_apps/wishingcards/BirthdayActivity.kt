package com.akshay_apps.wishingcards

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday.*
import kotlinx.android.synthetic.main.activity_birthday.birthdayGreeting as birthdayGreeting1

class BirthdayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

        val name = intent.getStringExtra(MainActivity.NAME_EXTRA)
        birthdayGreeting1.text = "Happy Birthday\n$name"
    }
}