package app.kochergin.stat

import android.app.Application
import app.kochergin.stat.common.di.DaggerCommonComponent
import app.kochergin.stat.di.AppProvider
import app.kochergin.stat.di.DaggerAppComponent

class AppDelegate : Application() {
    lateinit var appProvider: AppProvider

    override fun onCreate() {
        super.onCreate()
        val commonProvider = DaggerCommonComponent.factory().create(this)
        appProvider = DaggerAppComponent.builder()
            .commonProvider(commonProvider)
            .build()
    }
}

val Application.appProvider: AppProvider
    get() = (this as AppDelegate).appProvider