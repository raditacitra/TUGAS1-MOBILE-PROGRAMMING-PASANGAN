package com.raditacitra.acer.aplikasipasangan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonacak.setOnClickListener {cariPasangan()}
    }

    fun cariPasangan(){
        val randomCewek = Random().nextInt(5)+1
        val randomCowok = Random().nextInt(5)+1
        val drawableResCewek = when (randomCewek){
            1 ->R.drawable.pi1
            2 ->R.drawable.pi2
            3 ->R.drawable.pi3
            4 ->R.drawable.pi4
            else ->R.drawable.pi5
        }
        val drawableResCowok = when (randomCowok){
            1 ->R.drawable.pa1
            2 ->R.drawable.pa2
            3 ->R.drawable.pa3
            4 ->R.drawable.pa4
            else ->R.drawable.pa5

        }
        cewek.setImageResource(drawableResCewek)
        cowok.setImageResource(drawableResCowok)
    }
}
