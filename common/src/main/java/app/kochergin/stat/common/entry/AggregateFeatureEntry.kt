package app.kochergin.stat.common.entry

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder

interface AggregateFeatureEntry : FeatureEntry {
    fun NavGraphBuilder.navigation(navController: NavController, destinations: Destinations)
}