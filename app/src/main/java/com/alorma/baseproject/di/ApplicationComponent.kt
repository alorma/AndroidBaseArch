package com.alorma.baseproject.di

import com.alorma.baseproject.di.module.ApplicationModule
import com.alorma.baseproject.di.module.NetModule
import com.alorma.baseproject.ui.splash.di.SplashComponent
import com.alorma.baseproject.ui.splash.di.SplashModule
import com.alorma.baseproject.di.module.DataModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetModule::class, DataModule::class])
interface ApplicationComponent {
    infix fun add(module: SplashModule): SplashComponent

    // TODO Add modules here, as example ^
}