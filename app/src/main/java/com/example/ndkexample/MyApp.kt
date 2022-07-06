package com.example.ndkexample

import android.app.Application

class MyApp: Application() {

    init {
        System.loadLibrary("keys")
    }

    external fun getPublicKey(): String?
    external fun getPrivateKey(): String?

    override fun onCreate() {
        super.onCreate()

    }
}