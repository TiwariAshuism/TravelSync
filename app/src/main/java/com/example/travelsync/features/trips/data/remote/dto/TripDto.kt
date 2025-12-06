package com.example.travelsync.features.trips.data.remote.dto

import com.google.gson.annotations.SerializedName

data class TripDto(
    @SerializedName("id")
    val id: String? = null,
    
    @SerializedName("title")
    val title: String,
    
    @SerializedName("description")
    val description: String? = null,
    
    @SerializedName("startDate")
    val startDate: String? = null,
    
    @SerializedName("endDate")
    val endDate: String? = null,
    
    @SerializedName("location")
    val location: String? = null,
    
    @SerializedName("latitude")
    val latitude: Double? = null,
    
    @SerializedName("longitude")
    val longitude: Double? = null,
    
    @SerializedName("coverImageUrl")
    val coverImageUrl: String? = null,
    
    @SerializedName("createdAt")
    val createdAt: String? = null,
    
    @SerializedName("updatedAt")
    val updatedAt: String? = null,
    
    @SerializedName("isSynced")
    val isSynced: Boolean? = false,
    
    @SerializedName("userId")
    val userId: String? = null
)
