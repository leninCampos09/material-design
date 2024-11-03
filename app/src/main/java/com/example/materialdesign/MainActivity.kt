package com.example.materialdesign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var userInputLayout: TextInputLayout
    private lateinit var userInputEditText: TextInputEditText
    private lateinit var passwordInputLayout: TextInputLayout
    private lateinit var passwordInputEditText: TextInputEditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userInputLayout = findViewById(R.id.textInputLayout)
        userInputEditText = findViewById(R.id.user)
        passwordInputLayout = findViewById(R.id.textInputLayoutEmail)
        passwordInputEditText = findViewById(R.id.password)
        loginButton = findViewById(R.id.login)

        loginButton.setOnClickListener {
            validateUserInput()
        }
    }

    private fun validateUserInput() {
        val username = userInputEditText.text.toString().trim()
        val password = passwordInputEditText.text.toString().trim()

        // Validación del nombre de usuario
        if (username.length > 20) {
            userInputLayout.error = "El nombre de usuario no puede exceder 20 caracteres."
            return
        } else {
            userInputLayout.error = null // Limpia el error si la validación es correcta
        }

        // Validación de la contraseña
        if (password.isEmpty()) {
            passwordInputLayout.error = "La contraseña es requerida."
            return
        } else if (password.length > 10) {
            passwordInputLayout.error = "La contraseña no puede exceder 10 caracteres."
            return
        } else {
            passwordInputLayout.error = null // Limpia el error si la validación es correcta
        }

        // Verificar credenciales
        if (username == "lenin campos" && password == "123") {
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
            // Pasar a WelcomeActivity
            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra("USERNAME", username) // Pasar el nombre de usuario
            startActivity(intent)
        } else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
        }
    }
}
