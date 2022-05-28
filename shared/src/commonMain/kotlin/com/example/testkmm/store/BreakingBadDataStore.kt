package com.example.testkmm.store

interface BreakingBadDataStore {
    suspend fun someStore(): String
}