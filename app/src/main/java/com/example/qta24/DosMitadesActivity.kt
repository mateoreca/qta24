package com.example.qta24

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class DosMitadesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dos_mitades)

        // Botón "Dos Mitades" (ya está en esta actividad)
        val dosMitadesButton = findViewById<ImageButton>(R.id.dos_mitades)
        dosMitadesButton.setOnClickListener {
            val intent = Intent(this, DosMitadesActivity::class.java)
            startActivity(intent)
        }

        // Botón "Dos Palabras"
        val dosPalabrasButton = findViewById<ImageButton>(R.id.dos_palabras)
        dosPalabrasButton.setOnClickListener {
            val intent = Intent(this, DosPalabrasActivity::class.java)
            startActivity(intent)
        }

        // Botón "Quitar Fragmento"
        val quitarFragmentoButton = findViewById<ImageButton>(R.id.quitar_fragmento)
        quitarFragmentoButton.setOnClickListener {
            val intent = Intent(this, QuitarFragmentoActivity::class.java)
            startActivity(intent)
        }

        // Botón "Equis" para ir a IniciarSesionActivity
        val botonequis = findViewById<ImageButton>(R.id.botonequis)
        botonequis.setOnClickListener {
            val intent = Intent(this, IniciarSesionActivity::class.java)
            startActivity(intent)
        }

        // Botón para procesar la cadena de texto
        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editTextText)
        val mostrarDosTextView = findViewById<TextView>(R.id.mostrar_dos)

        button.setOnClickListener {
            val cadena = editText.text.toString()
            val resultado = dosMitades(cadena)
            mostrarDosTextView.text = resultado
        }
    }

    // Algoritmo para "Dos mitades"
    private fun dosMitades(cadena: String): String {
        if (cadena.isEmpty()) return "Ups! algo salió mal, revisa tu cadena."

        val medio = (cadena.length + 1) / 2
        val primeraParte = cadena.substring(0, medio)
        val segundaParte = cadena.substring(medio)

        return "$segundaParte$primeraParte"
    }
}
