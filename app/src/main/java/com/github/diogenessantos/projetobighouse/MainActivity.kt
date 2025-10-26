package com.github.diogenessantos.projetobighouse

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.diogenessantos.projetobighouse.databinding.ActivityMainBinding
import com.github.diogenessantos.projetobighouse.ui.theme.ProjetobighouseTheme

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.floatingActionButton3.setOnClickListener {
            val intent : Intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onResume() {
        super.onResume()

    }
}