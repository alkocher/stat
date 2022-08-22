package app.kochergin.stat.settings.api

import androidx.compose.runtime.compositionLocalOf

interface SettingsProvider

val LocalSettingsProvider = compositionLocalOf<SettingsProvider> {
    error("No settings provider found!")
}