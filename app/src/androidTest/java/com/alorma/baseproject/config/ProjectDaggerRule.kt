package com.alorma.baseproject.config

import android.support.test.InstrumentationRegistry
import com.alorma.myapplication.TrendingMoviesApp
import com.alorma.myapplication.di.ApplicationComponent
import com.alorma.myapplication.di.module.ApplicationModule
import com.alorma.myapplication.di.module.NetModule
import it.cosenonjaviste.daggermock.DaggerMock
import it.cosenonjaviste.daggermock.DaggerMockRule

fun getDaggerRule(): DaggerMockRule<ApplicationComponent> =
        DaggerMock.rule(ApplicationModule(app), NetModule(app)) {
            set { component ->
                app.updateComponent(component)
            }
        }

val app: TrendingMoviesApp get() = InstrumentationRegistry.getTargetContext().applicationContext as TrendingMoviesApp