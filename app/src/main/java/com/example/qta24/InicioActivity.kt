package com.example.qta24

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio) // Asigna el layout inicio.xml a la actividad

        // Botón "Iniciar Sesión"
        val iniciarSesionButton = findViewById<Button>(R.id.button)
        iniciarSesionButton.setOnClickListener {
            // Iniciar la actividad que desees (por ejemplo, DosMitadesActivity)
            val intent = Intent(this, IniciarSesionActivity::class.java)
            startActivity(intent)
        }
    }
}
