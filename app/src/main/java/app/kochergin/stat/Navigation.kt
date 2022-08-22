package app.kochergin.stat

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import app.kochergin.stat.common.entry.find
import app.kochergin.stat.di.LocalAppProvider
import app.kochergin.stat.main.entry.MainEntry
import app.kochergin.stat.settings.api.SettingsEntry

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val destinations = LocalAppProvider.current.destinations

    val mainScreen = destinations.find<MainEntry>()
    val settingsScreen = destinations.find<SettingsEntry>()

    Box(modifier = Modifier.fillMaxSize()) {
        NavHost(navController = navController, startDestination = mainScreen.destination()) {
            with(mainScreen) {
                composable(navController, destinations)
            }
            with(settingsScreen) {
                composable(navController, destinations)
            }
        }
    }
}