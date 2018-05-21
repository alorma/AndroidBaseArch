package com.alorma.baseproject

import android.app.Application
import com.alorma.baseproject.di.ApplicationComponent
import com.alorma.baseproject.di.DaggerApplicationComponent
import com.alorma.baseproject.di.module.ApplicationModule
import com.alorma.baseproject.di.module.NetModule

class BaseProjectApp : Application() {

    companion object {
        lateinit var component: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .netModule(NetModule(this))
                .build()
    }

    fun updateComponent(updateComponent: ApplicationComponent) {
        component = updateComponent
    }
}
