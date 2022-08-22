package app.kochergin.stat.di

import app.kochergin.stat.main.di.MainEntryModule
import app.kochergin.stat.settings.impl.di.SettingsEntryModule
import dagger.Module

@Module(
    includes = [
        MainEntryModule::class,
        SettingsEntryModule::class
    ]
)
class NavigationModule