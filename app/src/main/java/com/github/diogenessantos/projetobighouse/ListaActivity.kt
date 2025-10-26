package com.github.diogenessantos.projetobighouse

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.diogenessantos.projetobighouse.adapter.IdoloAdapter
import com.github.diogenessantos.projetobighouse.databinding.ActivityListaFraseBinding
import com.github.diogenessantos.projetobighouse.model.Idolo
import java.time.LocalDateTime

class ListaActivity : AppCompatActivity() {
    private  lateinit var listaActivityBinding : ActivityListaFraseBinding;




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listaActivityBinding = ActivityListaFraseBinding.inflate(layoutInflater)
        setContentView(listaActivityBinding.root)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onResume() {
        super.onResume()

        val listaIdolo: List<Idolo> =
            listOf(Idolo("Tenho memoria boa para coisa ruim", LocalDateTime.now().toString()))

        val listaAdapte = IdoloAdapter(listaIdolo)
        listaActivityBinding.activityListaFraseRecyclerview.layoutManager = LinearLayoutManager(this)
        listaActivityBinding.activityListaFraseRecyclerview.adapter = listaAdapte

    }
}