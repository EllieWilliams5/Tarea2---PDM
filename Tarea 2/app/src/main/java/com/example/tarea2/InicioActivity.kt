package com.example.tarea2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val inputApodo = findViewById<EditText>(R.id.inputApodo)
        val inputEmail = findViewById<EditText>(R.id.inputEmail)
        val buttonContinuar = findViewById<Button>(R.id.buttonContinuar)

        buttonContinuar.setOnClickListener {
            val intent = Intent(this, IngredientesActivity::class.java)
            startActivity(intent)
        }
    }
}