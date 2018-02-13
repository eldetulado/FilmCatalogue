package com.example.oso.filmcatalogue

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var idImage:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState != null)
            image.setImageResource(savedInstanceState.getInt("DATOS"))
    }

    override fun onResume() {
        super.onResume()
        btnGravity.setOnClickListener(this)
        btnGuerra.setOnClickListener(this)
        btnJuguete.setOnClickListener(this)
        btnJumanji.setOnClickListener(this)
        btnOrigen.setOnClickListener(this)
        btnRey.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnGravity -> idImage = R.drawable.gravity
            R.id.btnGuerra -> idImage = R.drawable.guerra
            R.id.btnJuguete -> idImage = R.drawable.juguete
            R.id.btnJumanji -> idImage = R.drawable.jumanji
            R.id.btnOrigen -> idImage = R.drawable.origen
            R.id.btnRey -> idImage = R.drawable.reyleon
        }
        image.setImageResource(idImage)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("DATOS",idImage)
    }
}
