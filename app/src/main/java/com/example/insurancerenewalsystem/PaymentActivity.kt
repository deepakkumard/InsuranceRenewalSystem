package com.example.insurancerenewalsystem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PaymentActivity : AppCompatActivity() {
    lateinit var card:EditText
    lateinit var cvv:EditText
    lateinit var expiry:EditText
    lateinit var name:EditText
    lateinit var btnpay:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


        card=findViewById(R.id.card) as EditText
        cvv=findViewById(R.id.cvv) as EditText
        name=findViewById(R.id.name) as EditText
        expiry=findViewById(R.id.expiry) as EditText
        btnpay=findViewById(R.id.btnpay) as Button

        btnpay.setOnClickListener {
            Toast.makeText(this,"Payment done",Toast.LENGTH_SHORT).show()

            val intent= Intent(this,LastPage::class.java)
            startActivity(intent)
        }
    }
}
