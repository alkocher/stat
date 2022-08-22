package app.kochergin.stat.di

import app.kochergin.stat.common.di.CommonProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [
        CommonProvider::class
    ],
    modules = [
        NavigationModule::class
    ]
)
interface AppComponent : AppProvider