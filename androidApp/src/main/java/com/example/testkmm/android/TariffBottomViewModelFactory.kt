package com.example.testkmm.android

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class TariffBottomViewModelFactory(
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel() as T
    }

//    class Factory {
//        fun create(): TariffBottomViewModelFactory {
//            return TariffBottomViewModelFactory()
//        }
//    }
}