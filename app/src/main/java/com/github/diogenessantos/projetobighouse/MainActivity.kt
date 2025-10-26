package com.github.diogenessantos.projetobighouse

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.diogenessantos.projetobighouse.adapter.IdoloAdapter
import com.github.diogenessantos.projetobighouse.databinding.ActivityMainBinding
import com.github.diogenessantos.projetobighouse.model.Idolo

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val listaAdapter: IdoloAdapter by lazy { IdoloAdapter(listOf()) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        configureAdapter(listaAdapter)

        binding.floatingActionButton3.setOnClickListener {
            startActivity(Intent(this , FormularioActivity::class.java))
        }

    }

    override fun onResume() {
        super.onResume()
        listaAdapter.notifique(listOf(Idolo("Seja vc mesmo" , "25/23/2025")))
    }
    private fun configureAdapter(adapter: IdoloAdapter) {
        binding.activityListaFraseRecyclerview.layoutManager = LinearLayoutManager(this)
        binding.activityListaFraseRecyclerview.adapter = adapter
    }


}