package com.example.birthdaywisher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            val message = editTextTextPersonName.text.toString()
            val intent=Intent(this,MainActivity2::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }

            startActivity(intent)

        }
    }
}