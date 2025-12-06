package com.example.travelsync.features.entries.data.remote.dto

import com.google.gson.annotations.SerializedName

data class EntryDto(
    @SerializedName("id")
    val id: String? = null,
    
    @SerializedName("tripId")
    val tripId: String,
    
    @SerializedName("title")
    val title: String,
    
    @SerializedName("content")
    val content: String? = null,
    
    @SerializedName("date")
    val date: String? = null,
    
    @SerializedName("location")
    val location: String? = null,
    
    @SerializedName("latitude")
    val latitude: Double? = null,
    
    @SerializedName("longitude")
    val longitude: Double? = null,
    
    @SerializedName("imageUrls")
    val imageUrls: List<String>? = emptyList(),
    
    @SerializedName("createdAt")
    val createdAt: String? = null,
    
    @SerializedName("updatedAt")
    val updatedAt: String? = null,
    
    @SerializedName("isSynced")
    val isSynced: Boolean? = false,
    
    @SerializedName("mood")
    val mood: String? = null,
    
    @SerializedName("weather")
    val weather: String? = null
)
