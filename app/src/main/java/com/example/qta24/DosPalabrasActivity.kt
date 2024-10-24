package com.example.qta24

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class DosPalabrasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dos_palabras)

        // Botón "Dos Mitades"
        val dosMitadesButton = findViewById<ImageButton>(R.id.dos_mitades)
        dosMitadesButton.setOnClickListener {
            val intent = Intent(this, DosMitadesActivity::class.java)
            startActivity(intent)
        }

        // Botón "Dos Palabras" (ya está en esta actividad)
        val dosPalabrasButton = findViewById<ImageButton>(R.id.dos_palabras)
        dosPalabrasButton.setOnClickListener {
            // Si estás en esta actividad, puedes reiniciar la actividad si es necesario
            val intent = Intent(this, DosPalabrasActivity::class.java)
            startActivity(intent)
        }

        // Botón "Quitar Fragmento"
        val quitarFragmentoButton = findViewById<ImageButton>(R.id.quitar_fragmento)
        quitarFragmentoButton.setOnClickListener {
            val intent = Intent(this, QuitarFragmentoActivity::class.java)
            startActivity(intent)
        }

        // Botón para procesar la cadena de texto
        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editTextText)
        val mostrarDosTextView = findViewById<TextView>(R.id.mostrar_dos)

        button.setOnClickListener {
            val cadena = editText.text.toString()
            val resultado = dosPalabrasButton(cadena)
            mostrarDosTextView.text = resultado
        }
    }

    // Algoritmo para "Dos palabras"
    private fun dosPalabrasButton(cadena: String): String {
        val palabras = cadena.split(" ")

        if (palabras.size != 2) {
            return "Ups! algo salió mal, revisa tu cadena."
        }

        return "${palabras[1]} ${palabras[0]}"
    }
}
