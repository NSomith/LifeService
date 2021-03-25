package com.example.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.service.backservice.TimeService
import com.example.service.utils.Constants
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener {
            startServices(Constants.ACTION_START_SERVICE)
        }
    }

    fun startServices(action:String){
        startService(Intent(this,TimeService::class.java).apply {
            this.action = action
        })
    }
}