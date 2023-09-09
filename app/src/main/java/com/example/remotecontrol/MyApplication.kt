package com.example.remotecontrol

import android.app.Application

object MyApplication: Application() {
    private val TAG = "MyApplication"

    override fun onCreate() {
        super.onCreate()
    }
}