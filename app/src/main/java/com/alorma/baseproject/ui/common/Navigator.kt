package com.alorma.baseproject.ui.common

import android.app.Activity
import android.content.Intent

abstract class Navigator<in R: Route>(val activity: Activity) {
    fun start(intent: Intent) {
        activity.startActivity(intent)
    }

    abstract infix fun navigate(route: R)
}