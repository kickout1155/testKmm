package com.example.testkmm.usecase

import com.example.testkmm.di.CommonInjector
import com.example.testkmm.repository.BreakingBadRepository
import com.example.testkmm.store.BreakingBadDataStore
import kotlinx.coroutines.*
import org.kodein.di.instance

class SomeUseCase {
    private val repository: BreakingBadRepository by CommonInjector.kodein.instance()

    fun execute(block: (List<String>) -> Unit) {
        runBlocking {
            delay(5000)
            val p = repository.getBrBad()
//            block.invoke(p)
        }
//        CoroutineScope(Dispatchers.Default).launch {
//            delay(5000)
//            val p = repository.getBrBad()
//            block.invoke(p)
//        }
    }

    suspend fun someExecute():String{
        val p = repository.getBrBad()
        return p
    }

}