package app.kochergin.stat.main.di

import app.kochergin.stat.common.di.FeatureScoped
import app.kochergin.stat.main.presentation.MainScreenViewModel
import dagger.Component

@FeatureScoped
@Component(
    dependencies = [],
    modules = [MainModule::class]
)
interface MainScreenComponent : MainScreenProvider {
    val viewModel: MainScreenViewModel
}