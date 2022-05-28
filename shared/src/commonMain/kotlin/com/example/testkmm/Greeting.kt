package com.example.testkmm

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Greeting {
    val client = HttpClient()

    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    suspend fun getSomething():String{
        val response = client.get("https://evilinsult.com/generate_insult.php?lang=en&type=json")
        return response.bodyAsText()
    }
}