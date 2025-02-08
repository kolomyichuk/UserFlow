package com.example.getuserwithretrofitmvi

import android.app.Application
import com.example.getuserwithretrofitmvi.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            startKoin { appModule }
        }
    }
}