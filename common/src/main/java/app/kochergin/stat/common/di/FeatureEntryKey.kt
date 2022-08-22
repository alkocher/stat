package app.kochergin.stat.common.di

import app.kochergin.stat.common.entry.FeatureEntry
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
annotation class FeatureEntryKey(val value: KClass<out FeatureEntry>)