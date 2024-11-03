package com.example.materialdesign

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Obtener el nombre de usuario del Intent
        val username = intent.getStringExtra("USERNAME")

        // Mostrar el mensaje de bienvenida
        val welcomeTextView = findViewById<TextView>(R.id.welcomeText)
        welcomeTextView.text = "Bienvenido, $username!"
    }
}
