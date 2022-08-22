package app.kochergin.stat.settings.impl.di

import app.kochergin.stat.common.di.FeatureScoped
import app.kochergin.stat.settings.api.SettingsProvider
import app.kochergin.stat.settings.impl.presentation.SettingsViewModel
import dagger.Component

@FeatureScoped
@Component(
    dependencies = [],
    modules = [SettingsModule::class]
)
interface SettingsComponent : SettingsProvider {
    val viewModel: SettingsViewModel
}