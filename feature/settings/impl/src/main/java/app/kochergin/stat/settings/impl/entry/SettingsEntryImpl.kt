package app.kochergin.stat.settings.impl.entry

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import app.kochergin.stat.common.di.injectedViewModel
import app.kochergin.stat.common.entry.Destinations
import app.kochergin.stat.settings.api.SettingsEntry
import app.kochergin.stat.settings.impl.di.DaggerSettingsComponent
import app.kochergin.stat.settings.impl.presentation.SettingsScreen
import javax.inject.Inject

class SettingsEntryImpl @Inject constructor() : SettingsEntry() {
    @Composable
    override fun NavGraphBuilder.Composable(
        navController: NavController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val viewModel = injectedViewModel {
            DaggerSettingsComponent.builder()
                .build()
                .viewModel
        }
        SettingsScreen(viewModel = viewModel)
    }
}