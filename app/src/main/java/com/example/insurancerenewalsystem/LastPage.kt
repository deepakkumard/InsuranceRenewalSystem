package com.example.insurancerenewalsystem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LastPage : AppCompatActivity() {
    lateinit var thank:TextView
    lateinit var exit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_page)

        thank=findViewById(R.id.thank) as TextView
        exit=findViewById(R.id.exit) as Button

        exit.setOnClickListener {
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
