package app.kochergin.stat.main.di

import app.kochergin.stat.common.di.FeatureEntryKey
import app.kochergin.stat.common.entry.FeatureEntry
import app.kochergin.stat.main.entry.MainEntry
import app.kochergin.stat.main.entry.MainEntryImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
interface MainEntryModule {
    @Binds
    @Singleton
    @IntoMap
    @FeatureEntryKey(MainEntry::class)
    fun bindMainEntry(mainEntryImpl: MainEntryImpl): FeatureEntry
}