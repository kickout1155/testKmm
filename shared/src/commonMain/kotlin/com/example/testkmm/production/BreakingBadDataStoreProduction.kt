package com.example.testkmm.production

import com.example.testkmm.Greeting
import com.example.testkmm.store.BreakingBadDataStore
import io.ktor.client.*
import io.ktor.client.plugins.kotlinx.serializer.*
import kotlinx.serialization.json.Json

class BreakingBadDataStoreProduction: BreakingBadDataStore {

//    val httpClient = HttpClient {
//        install(JsonFeature) {
//            val json = Json { ignoreUnknownKeys = true }
//            serializer = ContentNegotiation(json)
//        }
//    }

    override suspend fun someStore(): String {
        return Greeting().getSomething()
    }
}