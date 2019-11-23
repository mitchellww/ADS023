package com.example.a17214290001.Atividade19

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


     override fun onCreate(savedInstanceState: Bundle?) {
         println("onCreate disparado")
         setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)
    }

    override fun onStart(){
        println("onStart disparado")
        super.onStart()
    }

    override fun onResume(){
        println("onResume disparado")
        super.onResume()
    }

    override fun onPause(){
        println("onPause disparado")
        super.onPause()
    }

    override fun onStop(){
        println("onStop disparado")
        super.onStop()
    }
    override fun onDestroy(){
        println("onDestroy disparado")
        super.onDestroy()
    }
}
