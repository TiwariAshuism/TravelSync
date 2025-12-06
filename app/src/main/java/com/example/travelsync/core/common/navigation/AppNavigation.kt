package com.example.travelsync.core.common.navigation

import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.travelsync.features.entries.presentation.ui.AddEntryScreen
import com.example.travelsync.features.entries.presentation.ui.EntriesScreen
import com.example.travelsync.features.gallery.presentation.ui.GalleryScreen
import com.example.travelsync.features.settings.presentation.ui.SettingsScreen
import com.example.travelsync.features.trips.presentation.ui.TripOverviewScreen
import com.example.travelsync.features.trips.presentation.ui.TripsScreen

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = NavigationRoutes.Trips.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(NavigationRoutes.Trips.route) {
            TripsScreen(
                onTripClick = { tripId ->
                    navController.navigate(NavigationRoutes.TripOverview.createRoute(tripId))
                },
                onNavigateToSettings = {
                    navController.navigate(NavigationRoutes.Settings.route)
                }
            )
        }
        
        composable(
            route = NavigationRoutes.TripOverview.route,
            arguments = listOf(
                navArgument("tripId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val tripId = backStackEntry.arguments?.getString("tripId") ?: ""
            TripOverviewScreen(
                tripId = tripId,
                onBackClick = {
                    navController.popBackStack()
                },
                onNavigateToEntries = {
                    navController.navigate(NavigationRoutes.Entries.route)
                },
                onNavigateToAddEntry = {
                    navController.navigate(NavigationRoutes.AddEntry.createRoute(tripId))
                },
                onNavigateToGallery = {
                    navController.navigate(NavigationRoutes.Gallery.route)
                }
            )
        }
        
        composable(NavigationRoutes.Entries.route) {
            EntriesScreen(
                onBackClick = {
                    navController.popBackStack()
                },
                onEntryClick = { entryId ->
                    // Navigate to entry details if needed
                }
            )
        }
        
        composable(
            route = NavigationRoutes.AddEntry.route,
            arguments = listOf(
                navArgument("tripId") {
                    type = NavType.StringType
                }
            )
        ) { backStackEntry ->
            val tripId = backStackEntry.arguments?.getString("tripId") ?: ""
            AddEntryScreen(
                tripId = tripId,
                onBackClick = {
                    navController.popBackStack()
                },
                onEntrySaved = {
                    navController.popBackStack()
                }
            )
        }
        
        composable(NavigationRoutes.Gallery.route) {
            GalleryScreen(
                onBackClick = {
                    navController.popBackStack()
                },
                onImageClick = { imageId ->
                    // Handle image click if needed
                }
            )
        }
        
        composable(NavigationRoutes.Settings.route) {
            SettingsScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}
