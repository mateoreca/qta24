package com.example.qta24

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class QuitarFragmentoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quitar_fragmento)

        // Botón "Dos Mitades"
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

        // Botón "Quitar Fragmento" (ya está en esta actividad)
        val quitarFragmentoButton = findViewById<ImageButton>(R.id.quitar_fragmento)
        quitarFragmentoButton.setOnClickListener {
            // Si estás en esta actividad, puedes reiniciar la actividad si es necesario
            val intent = Intent(this, QuitarFragmentoActivity::class.java)
            startActivity(intent)
        }

        // Botón para procesar la cadena de texto
        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editTextText)
        val mostrarQuitarTextView = findViewById<TextView>(R.id.mostrar_quitar)

        button.setOnClickListener {
            val cadena = editText.text.toString()
            val resultado = quitarFragmentoButton(cadena)
            mostrarQuitarTextView.text = resultado
        }
    }

    // Algoritmo para "Quitar fragmento"
    private fun quitarFragmentoButton(cadena: String): String {
        val primeraH = cadena.indexOf('h')
        val ultimaH = cadena.lastIndexOf('h')

        if (primeraH == -1 || ultimaH == -1 || primeraH == ultimaH) {
            return "Ups! algo salió mal, revisa tu cadena."
        }

        return cadena.removeRange(primeraH, ultimaH + 1)
    }
}
