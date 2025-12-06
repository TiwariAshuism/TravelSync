package com.example.travelsync

import android.app.Application
import com.google.firebase.FirebaseApp

class TravelSyncApp : Application() {
    
    override fun onCreate() {
        super.onCreate()
        
        // Initialize Firebase
        FirebaseApp.initializeApp(this)
    }
}
