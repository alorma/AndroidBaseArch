package com.alorma.baseproject.ui.splash

import com.alorma.baseproject.ui.common.BaseViewModel
import com.alorma.baseproject.ui.common.State
import javax.inject.Inject

class SplashViewModel @Inject constructor(
        private val splashRoute: SplashRoutes,
        private val splashNavigator: SplashNavigator) :
        BaseViewModel<State, SplashActions.SplashAction>() {

    override infix fun reduce(action: SplashActions.SplashAction) {
        when (action) {
            SplashActions.SplashAction.Load -> onLoad()
        }
    }

    private fun onLoad() {
        // TODO DO whatever on splash
        splashNavigator navigate splashRoute.main()
    }
}