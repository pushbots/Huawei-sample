package com.pushbots.example.huaweisdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pushbots.huaweisdk.Pushbots

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Pushbots.sharedInstance()!!.registerForRemoteNotifications()
    }
}
