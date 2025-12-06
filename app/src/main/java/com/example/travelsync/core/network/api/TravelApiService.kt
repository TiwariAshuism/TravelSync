package com.example.travelsync.core.network.api

import com.example.travelsync.features.entries.data.remote.dto.EntryDto
import com.example.travelsync.features.trips.data.remote.dto.TripDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface TravelApiService {
    
    // Trips endpoints
    @GET("trips")
    suspend fun getTrips(): Response<List<TripDto>>
    
    @GET("trips/{id}")
    suspend fun getTrip(@Path("id") tripId: String): Response<TripDto>
    
    @POST("trips")
    suspend fun createTrip(@Body trip: TripDto): Response<TripDto>
    
    @PUT("trips/{id}")
    suspend fun updateTrip(@Path("id") tripId: String, @Body trip: TripDto): Response<TripDto>
    
    @DELETE("trips/{id}")
    suspend fun deleteTrip(@Path("id") tripId: String): Response<Unit>
    
    // Entries endpoints
    @GET("trips/{tripId}/entries")
    suspend fun getEntries(@Path("tripId") tripId: String): Response<List<EntryDto>>
    
    @GET("entries/{id}")
    suspend fun getEntry(@Path("id") entryId: String): Response<EntryDto>
    
    @POST("trips/{tripId}/entries")
    suspend fun createEntry(@Path("tripId") tripId: String, @Body entry: EntryDto): Response<EntryDto>
    
    @PUT("entries/{id}")
    suspend fun updateEntry(@Path("id") entryId: String, @Body entry: EntryDto): Response<EntryDto>
    
    @DELETE("entries/{id}")
    suspend fun deleteEntry(@Path("id") entryId: String): Response<Unit>
}
