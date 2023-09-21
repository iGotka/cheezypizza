package com.example.cheezypizza_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class RegistrationActivity : AppCompatActivity() {
    lateinit var login: EditText
    lateinit var password: EditText
    lateinit var repeatPassword: EditText
    lateinit var email: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        login = findViewById(R.id.login)
        password = findViewById(R.id.password)
        repeatPassword = findViewById(R.id.repeat_password)
        email = findViewById(R.id.email)
    }
    fun registration(view: View){
        if(login.text.toString().isNotEmpty() && password.text.toString().isNotEmpty() && repeatPassword.text.toString().isNotEmpty() && email.text.toString().isNotEmpty()){
            if (password == repeatPassword){
            val intent = Intent( this, MenuActivity::class.java)
            startActivity(intent)
            }
            else{
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Пароли не совпадают")
                    .setPositiveButton("Ok",null)
                    .create()
                    .show()
            }
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
    fun returnBack(view: View){
        val intent = Intent( this, AuthorizationActivity::class.java)
        startActivity(intent)
    }
}