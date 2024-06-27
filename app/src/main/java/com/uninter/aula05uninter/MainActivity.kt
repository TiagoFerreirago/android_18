package com.uninter.aula05uninter

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import android.content.DialogInterface

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val mail = findViewById<TextInputEditText>(R.id.edtMail).text.toString()
        val password = findViewById<TextInputEditText>(R.id.edtPass).text.toString();

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            login(mail, password)
        }
        findViewById<TextView>(R.id.forgot).setOnClickListener{
            startActivity(Intent(this, telarecuperarasenhaaula05::class.java))
        }
    }
        /*findViewById<Button>(R.id.btnLogin).setOnClickListener {
             val mail = findViewById<TextInputEditText>(R.id.edtMail).text.toString()
            val pass = findViewById<TextInputEditText>(R.id.edtPass).text.toString();

            if(mail == "tiagouninter@uninter.com" && pass == "8888") {
                startActivity(Intent(this, telapart3list::class.java))
            }
            else
            {
                Toast.makeText(this, "Úsuario ou Senha Invalido", Toast.LENGTH_LONG).show()
            }
        }
        findViewById<TextView>(R.id.forgot).setOnClickListener{
            startActivity(Intent(this,telarecuperarasenhaaula05::class.java))
        }*/


             fun login(login: String, pass: String) {


                try {
                    Log.i("MainActivity", "Email $login e Senha $pass")
                    if (login == "tiagouninter@uninter.com" && pass == "8888") {
                        startActivity(Intent(this, telapart3list::class.java))
                    }
                    else {
                      //  Toast.makeText(this, "Úsuario ou Senha Invalido", Toast.LENGTH_LONG).show()
                        val dialog = AlertDialog.Builder(this).create()
                        dialog.setTitle("Acesso Negado")
                        dialog.setMessage("Usuario ou Senha Invalidos")
                        dialog.setButton(AlertDialog.BUTTON_NEUTRAL,"Ok"){
                                dialog,_-> dialog.dismiss()
                        }
                        dialog.show()
                    }

                } catch (ex: Exception) {
                    Log.e("MainActivity", ex.message.toString())

                }
            }
        }
