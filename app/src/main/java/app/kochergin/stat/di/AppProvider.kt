package app.kochergin.stat.di

import androidx.compose.runtime.compositionLocalOf
import app.kochergin.stat.common.di.CommonProvider
import app.kochergin.stat.common.entry.Destinations

interface AppProvider : CommonProvider {
    val destinations: Destinations
}

val LocalAppProvider = compositionLocalOf<AppProvider> {
    error("No app provider found!")
}