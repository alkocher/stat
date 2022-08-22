package app.kochergin.stat.main.entry

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import app.kochergin.stat.common.di.injectedViewModel
import app.kochergin.stat.common.entry.Destinations
import app.kochergin.stat.common.entry.find
import app.kochergin.stat.main.di.DaggerMainScreenComponent
import app.kochergin.stat.main.presentation.MainScreen
import app.kochergin.stat.settings.api.SettingsEntry
import javax.inject.Inject

class MainEntryImpl @Inject constructor() : MainEntry() {
    @Composable
    override fun NavGraphBuilder.Composable(
        navController: NavController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        val viewModel = injectedViewModel {
            DaggerMainScreenComponent.builder()
                .build()
                .viewModel
        }
        MainScreen(
            viewModel = viewModel,
            onCardClick = {
                val settingsDestination = destinations
                    .find<SettingsEntry>()
                    .destination()
                navController.navigate(settingsDestination)
            }
        )
    }
}