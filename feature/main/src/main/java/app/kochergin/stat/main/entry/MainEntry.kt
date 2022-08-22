package app.kochergin.stat.main.entry

import app.kochergin.stat.common.entry.ComposableFeatureEntry

abstract class MainEntry : ComposableFeatureEntry {
    final override val featureRoute: String = "main"

    fun destination() = featureRoute
}