package com.android.ytsapenko.lesson2task1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toastButton:Button = findViewById<Button>(R.id.toast_button)
        toastButton.setOnClickListener({
            Toast.makeText(this,"Hello toast!",Toast.LENGTH_SHORT).show()
        })
        val randomButton:Button = findViewById<Button>(R.id.random_button)
        count_button.setOnClickListener({
            countMe(count_button)
        })
        val countButton:Button = findViewById(R.id.count_button)
        countButton.setOnClickListener({

        })
    }

    fun countMe(view: View){
        val countTextView: TextView = findViewById(R.id.textView)
        val countString:String = countTextView.text.toString()
        var count:Int = Integer.parseInt(countString)
        count++;
        countTextView.text = count.toString()
    }

    fun randomMe(view: View){
        val countTextView: TextView = findViewById(R.id.textView)
        countTextView.text = Random(10).toString()
    }
}
