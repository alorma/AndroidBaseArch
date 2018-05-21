package com.alorma.baseproject.ui.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alorma.baseproject.BaseProjectApp.Companion.component
import com.alorma.baseproject.ui.splash.di.SplashModule
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {
    @Inject
    lateinit var actions: SplashActions

    @Inject
    lateinit var viewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component add SplashModule(this) inject this

        viewModel.init(this)
        viewModel reduce actions.load()
    }
}
