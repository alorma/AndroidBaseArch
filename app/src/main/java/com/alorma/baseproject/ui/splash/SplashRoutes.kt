package com.alorma.baseproject.ui.splash

import com.alorma.baseproject.ui.common.Route
import javax.inject.Inject

class SplashRoutes @Inject constructor() {
    sealed class SplashRoute : Route() {
        object Main : SplashRoute()
        object Error : SplashRoute()
    }

    fun main(): SplashRoute = SplashRoute.Main
    fun error(): SplashRoute = SplashRoute.Error
}