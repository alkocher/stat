package app.kochergin.stat.settings.api

import app.kochergin.stat.common.entry.ComposableFeatureEntry

abstract class SettingsEntry : ComposableFeatureEntry {
    final override val featureRoute: String = "settings"

    fun destination() = featureRoute
}