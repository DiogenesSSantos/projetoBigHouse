package com.github.diogenessantos.projetobighouse

import android.app.Dialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.BasicAlertDialog
import com.github.diogenessantos.projetobighouse.databinding.ActivityFormularioBinding
import com.github.diogenessantos.projetobighouse.model.Idolo

class FormularioActivity : AppCompatActivity(){
        private lateinit var binding: ActivityFormularioBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormularioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityFormularioFabBotaoVoltar.setOnClickListener {
            println("VOLTANDO")
            finish()
        }

        binding.activityFormularioFabBotaoSalvar.setOnClickListener {
            val texto =  binding.activityFormularioEditTextFrase
            val data  =  binding.activityFormularioEditTextData
            val idolo = Idolo(texto.text.toString() , data.text.toString())
            println("${idolo.frase} ||| ${idolo.data} ")
            Log.d("Formulario", "Salvando: ${idolo.frase} ||| ${idolo.data}")
            Toast.makeText(this, "Salvo", Toast.LENGTH_SHORT).show()

            texto.editableText.clear()
            data.editableText.clear()

        }

    }



}