package com.alorma.baseproject.ui.splash

import com.alorma.baseproject.ui.common.Action
import javax.inject.Inject

class SplashActions @Inject constructor() {
    sealed class SplashAction : Action() {
        object Load : SplashAction()
    }

    fun load(): SplashAction = SplashAction.Load
}