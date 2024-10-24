package com.example.qta24

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageButton

class IniciarSesionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.iniciar_sesion) // Asigna el layout iniciar_sesion.xml a la actividad

        // Botón "Atras" para ir a InicioActivity
        val atrasButton = findViewById<ImageButton>(R.id.atrasiniciarsesion)
        atrasButton.setOnClickListener {
            val intent = Intent(this, InicioActivity::class.java)
            startActivity(intent)
        }

        // Botón para ir a DosMitadesActivity
        val dosMitadesButton = findViewById<Button>(R.id.button)
        dosMitadesButton.setOnClickListener {
            val intent = Intent(this, DosMitadesActivity::class.java)
            startActivity(intent)
        }
    }
}
