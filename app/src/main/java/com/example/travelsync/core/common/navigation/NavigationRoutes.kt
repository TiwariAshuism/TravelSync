package com.example.travelsync.core.common.navigation

sealed class NavigationRoutes(val route: String) {
    object Trips : NavigationRoutes("trips")
    object TripOverview : NavigationRoutes("trip_overview/{tripId}") {
        fun createRoute(tripId: String) = "trip_overview/$tripId"
    }
    object Entries : NavigationRoutes("entries")
    object AddEntry : NavigationRoutes("add_entry/{tripId}") {
        fun createRoute(tripId: String) = "add_entry/$tripId"
    }
    object Gallery : NavigationRoutes("gallery")
    object Settings : NavigationRoutes("settings")
}
