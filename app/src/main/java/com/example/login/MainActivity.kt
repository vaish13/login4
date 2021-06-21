package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnlogin: Button = findViewById(R.id.btn)

        val etEmail: EditText = findViewById(R.id.etemail)

        val etPass: EditText = findViewById(R.id.etpass)

        btnlogin.setOnClickListener {
            val userEmail:String = etEmail.text.toString()
            val userPass:String = etPass.text.toString()

            val tv: TextView = findViewById(R.id.tv1)

            if(userEmail.equals("vaishnavitakwat@gmail.com") && userPass.equals("vaishu@123"))
            {
                tv.text = ""
                Toast.makeText(this,"Login Sucessful !",Toast.LENGTH_LONG).show()
            }
            else
            {
                tv.text = "Something went wrong !"
                Toast.makeText(this,"Invalid Credentials !",Toast.LENGTH_LONG).show()
            }


        }
    }
}