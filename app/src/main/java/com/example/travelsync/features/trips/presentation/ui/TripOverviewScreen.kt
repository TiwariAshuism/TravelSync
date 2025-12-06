package com.example.travelsync.features.trips.presentation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TripOverviewScreen(
    tripId: String,
    onBackClick: () -> Unit = {},
    onNavigateToEntries: () -> Unit = {},
    onNavigateToAddEntry: () -> Unit = {},
    onNavigateToGallery: () -> Unit = {}
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("Trip Overview Screen - Trip ID: $tripId")
    }
}
