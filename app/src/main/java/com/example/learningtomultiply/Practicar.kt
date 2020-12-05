package com.example.learningtomultiply

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_practicar.*
import kotlin.random.Random

class Practicar : AppCompatActivity() {
    var resultado = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practicar)

        btnRespuesta.setOnClickListener{
            val resText = etRespuesta.text.toString()
            if (!resText.equals("")){
                val respuesta = etRespuesta.text.toString().toInt()
                if (respuesta == resultado){
                    Log.d("resultado", "Le atinaste")
                    crearDialogoOk()

                }else{
                    Log.d("resultado", "No le atinaste")
                    crearDialogoFail()

                }
            }
            generaOperacion()
        }
        generaOperacion()

    }

    fun crearDialogoOk(){

        val miDialogView = LayoutInflater.from(this).inflate(R.layout.dialogo_ok, null)
        val mBuilder = AlertDialog.Builder(this).setView(miDialogView).setTitle("Muy Bien!!")

        val miDialogoOk = mBuilder.create()
        miDialogoOk.show()


    }

    fun crearDialogoFail(){

        val miDialogView = LayoutInflater.from(this).inflate(R.layout.dialogo_fail, null)
        val mBuilder = AlertDialog.Builder(this).setView(miDialogView).setTitle("Fallaste!!")

        val miDialogoFail = mBuilder.create()
        miDialogoFail.show()

    }

    fun generaOperacion(){
        val numero1 = Random.nextInt(1, 10)
        val numero2 = Random.nextInt(1, 10)

        resultado = numero1*numero2

        tvRandom.text = "$numero1 x $numero2 = ?"
        etRespuesta.text.clear()
    }

}