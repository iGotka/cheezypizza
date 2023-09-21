package com.example.cheezypizza_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class AuthorizationActivity : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization2)
        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
    }

    fun signin(view: View){
        if(login.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
            val intent = Intent( this, MenuActivity::class.java)
            startActivity(intent)
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("Ok",null)
                .create()
                .show()
        }
    }
    fun registration(view: View){
        val intent = Intent( this, RegistrationActivity::class.java)
        startActivity(intent)
    }
}