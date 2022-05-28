package com.example.testkmm.di

import com.example.testkmm.repository.BreakingBadRepository
import com.example.testkmm.usecase.SomeUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.kodein.di.DI
import org.kodein.di.direct
import org.kodein.di.instance
import kotlin.native.concurrent.ThreadLocal


@ThreadLocal
object CommonInjector {
    val kodein = DI.lazy {
        import(brBadModule)
    }

    val scope: CoroutineScope = CoroutineScope(Dispatchers.Main)
    fun useCaseSome() = kodein.direct.instance<SomeUseCase>()

}