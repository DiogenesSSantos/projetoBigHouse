package com.github.diogenessantos.projetobighouse.adapter

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.github.diogenessantos.projetobighouse.R
import com.github.diogenessantos.projetobighouse.model.Idolo

class IdoloAdapter (var listaFraseIdolo : List<Idolo>) : RecyclerView.Adapter<IdoloAdapter.idoloViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): idoloViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.idolo_layout, parent, false) // usar layout de item, não o layout de activity
        return idoloViewHolder(view)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: idoloViewHolder, position: Int) {
        holder.bind(listaFraseIdolo[position])
    }



    override fun getItemCount(): Int = listaFraseIdolo.size



    fun notifique(lista : List<Idolo>) {
        listaFraseIdolo = lista
        notifyDataSetChanged()

    }


    inner class idoloViewHolder (view : View) : RecyclerView.ViewHolder(view) {

        private val fraseText: TextView = view.findViewById(R.id.itemFraseText)
        private val dataText: TextView = view.findViewById(R.id.itemDataText)

        @RequiresApi(Build.VERSION_CODES.O)
        fun bind(idolo: Idolo) {
            fraseText.text = idolo.frase
            dataText.text = idolo.data
        }

    }
}