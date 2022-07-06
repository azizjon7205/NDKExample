package com.example.ndkexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    init {
        System.loadLibrary("keys")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("@@@", "Public key : ${(application as MyApp).getPublicKey().toString()}")
        Log.d("@@@", "Private key : ${(application as MyApp).getPrivateKey().toString()}")
    }
}