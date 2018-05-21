package com.alorma.baseproject.ui.splash

import android.app.Activity
import android.content.Intent
import com.alorma.baseproject.ui.common.Navigator
import com.readystatesoftware.chuck.internal.ui.MainActivity

class SplashNavigator(activity: Activity) : Navigator<SplashRoutes.SplashRoute>(activity) {

    override fun navigate(route: SplashRoutes.SplashRoute) {
        when (route) {
            SplashRoutes.SplashRoute.Main -> openMain()
            SplashRoutes.SplashRoute.Error -> onError()
        }
    }

    private fun openMain() = start(Intent(activity, MainActivity::class.java))

    private fun onError() {
        TODO()
    }
}