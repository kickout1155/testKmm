package com.example.testkmm.repository

import com.example.testkmm.di.CommonInjector.kodein
import com.example.testkmm.store.BreakingBadDataStore
import org.kodein.di.instance

class BreakingBadRepository {
    private val dataStore: BreakingBadDataStore by kodein.instance()

    suspend fun getBrBad(): String{
        return dataStore.someStore()
    }
}