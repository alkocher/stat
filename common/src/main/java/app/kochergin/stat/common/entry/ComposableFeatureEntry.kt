package app.kochergin.stat.common.entry

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

interface ComposableFeatureEntry : FeatureEntry {
    fun NavGraphBuilder.composable(navController: NavController, destinations: Destinations) {
        composable(featureRoute, arguments, deepLinks) { backStackEntry ->
            Composable(navController, destinations, backStackEntry)
        }
    }

    @Composable
    fun NavGraphBuilder.Composable(
        navController: NavController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    )
}