package com.iotwebplanet.developer.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {

           // textView.text="Hello Kotlin"

            myrandom()
        }

    }

    private fun myrandom() {

        var x=Random().nextInt(10)

        textView.text="Hello Kotlin"+x.toString()


            }
}
