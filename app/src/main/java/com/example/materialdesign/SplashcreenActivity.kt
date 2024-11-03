package com.example.materialdesign
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.materialdesign.databinding.ActivitySplashcreenBinding

class splashcreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashcreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashcreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Iniciar la siguiente actividad después de un retraso
        Handler(Looper.getMainLooper()).postDelayed({
            // Cambia 'MainActivity::class.java' al nombre de tu actividad principal
            startActivity(Intent(this, MainActivity::class.java))
            finish() // Cerrar la actividad de splash
        }, 5000) // Ajusta el tiempo de retraso (5000 ms = 5 segundos)
    }
}
