package com.example.huaweisample

import android.app.Application
import com.pushbots.huaweisdk.Pushbots

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Pushbots.sharedInstance()?.init(this)
    }
}