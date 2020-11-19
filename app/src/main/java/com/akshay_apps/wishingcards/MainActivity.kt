package com.akshay_apps.wishingcards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast.*
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast as WidgetToast

class MainActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeBirthdayCard(view: View) {
//        val name = nameInput.editableText.toString()
//        makeText(this, "Happy Birthday $name", LENGTH_SHORT).show()
        val name = nameInput.editableText.toString()
        val intent = Intent(this, BirthdayActivity::class.java)
        intent.putExtra(NAME_EXTRA, name)
        startActivity(intent)
    }

    fun makeAnniversaryCard(view: View) {
        val name = nameInput.editableText.toString()
        val intent = Intent(this, AnniversaryActivity::class.java)
        intent.putExtra(NAME_EXTRA, name)
        startActivity(intent)
    }
    fun makeNewYearCard(view: View) {
        val name = nameInput.editableText.toString()
        val intent = Intent(this, NewYearActivity::class.java)
        intent.putExtra(NAME_EXTRA, name)
        startActivity(intent)
    }
    fun makeDiwaliCard(view: View) {
        val name = nameInput.editableText.toString()
        val intent = Intent(this, DiwaliActivity::class.java)
        intent.putExtra(NAME_EXTRA, name)
        startActivity(intent)
    }
}