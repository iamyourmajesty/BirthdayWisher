package com.example.birthdaywisher

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val player: MediaPlayer
        player= MediaPlayer.create(this,R.raw.hbirthday)

        button.setOnClickListener{

                player.start()

            val message = editTextTextPersonName.text.toString()
            val intent=Intent(this,MainActivity2::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }

            startActivity(intent)

        }
    }
}