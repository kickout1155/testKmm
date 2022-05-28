package com.example.testkmm.android

import androidx.lifecycle.ViewModel
import com.example.testkmm.android.logger.Logger
import com.example.testkmm.di.CommonInjector
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val p = CommonInjector.useCaseSome()

    fun test() {
        MainScope().launch {
            p.someExecute()
        }
    }

    private fun someTest(str: String) {
    }
}