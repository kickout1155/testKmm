package com.example.testkmm.di

import com.example.testkmm.production.BreakingBadDataStoreProduction
import com.example.testkmm.repository.BreakingBadRepository
import com.example.testkmm.store.BreakingBadDataStore
import com.example.testkmm.usecase.SomeUseCase
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.provider
import org.kodein.di.singleton

val brBadModule = DI.Module("testBreaking") {
//        bind<TokenRepository>() with singleton { BreakingBadDataStoreProduction(instance()) }
//        bind("isLoggedIn") from provider { instance<TokenRepository>().isLoggedIn() }
//        bind<AuthApi>() with singleton { AuthApiImpl() }
//        bind<LoginPresenter>() with provider { LoginPresenterImpl(di) }

    bind<BreakingBadDataStore>() with singleton { BreakingBadDataStoreProduction() }
    bind<BreakingBadRepository>() with provider { BreakingBadRepository() }
    bind<SomeUseCase>() with provider { SomeUseCase() }
}
