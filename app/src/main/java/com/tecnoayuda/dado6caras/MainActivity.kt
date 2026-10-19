package com.tecnoayuda.dado6caras

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : ComponentActivity() {
    private val dado = Dado()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handle edge-to-edge insets for our layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnTirarDado: Button = findViewById(R.id.btnTirarDado)
        val ivCaraDado: ImageView = findViewById(R.id.ivCaraDado)

        btnTirarDado.setOnClickListener {
            val resourceId = dado.cambiarCara()
            ivCaraDado.setImageResource(resourceId)
        }
    }
}
