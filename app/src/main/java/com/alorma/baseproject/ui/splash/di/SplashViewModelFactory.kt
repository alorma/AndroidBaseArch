package com.alorma.baseproject.ui.splash.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.alorma.baseproject.ui.splash.SplashNavigator
import com.alorma.baseproject.ui.splash.SplashRoutes
import com.alorma.baseproject.ui.splash.SplashViewModel
import javax.inject.Inject

class SplashViewModelFactory @Inject constructor(
        private val splashRoute: SplashRoutes,
        private val splashNavigator: SplashNavigator
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
            SplashViewModel(splashRoute, splashNavigator) as T
}