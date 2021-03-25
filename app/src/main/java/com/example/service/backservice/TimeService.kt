package com.example.service.backservice

import android.content.Intent
import android.util.Log
import androidx.lifecycle.LifecycleService
import com.example.service.utils.Constants
import timber.log.Timber

class TimeService:LifecycleService() {

//    first time while creating the service
    override fun onCreate() {
        super.onCreate()
    Log.d("action send","bbbbbb")    }

//    calls when service is already created
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        intent?.let {
            when(it.action){
                Constants.ACTION_START_SERVICE->{
//                    Timber.d("action send")
                    Log.d("action send","adasda")
                }
                Constants.ACTION_STOP_SERVICE->{

                }
                else->{}
            }
        }


        return super.onStartCommand(intent, flags, startId)
    }
}