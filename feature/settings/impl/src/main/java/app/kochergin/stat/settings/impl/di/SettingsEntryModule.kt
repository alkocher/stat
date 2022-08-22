package app.kochergin.stat.settings.impl.di

import app.kochergin.stat.common.di.FeatureEntryKey
import app.kochergin.stat.common.entry.FeatureEntry
import app.kochergin.stat.settings.api.SettingsEntry
import app.kochergin.stat.settings.impl.entry.SettingsEntryImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface SettingsEntryModule {
    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(SettingsEntry::class)
    fun bindSettingsEntry(settingsEntryImpl: SettingsEntryImpl): FeatureEntry
}