package com.alorma.baseproject.ui.splash.di

import com.alorma.baseproject.ui.splash.SplashActivity
import dagger.Subcomponent

@Subcomponent(modules = [SplashModule::class])
interface SplashComponent {
    infix fun inject(splashActivity: SplashActivity)
}