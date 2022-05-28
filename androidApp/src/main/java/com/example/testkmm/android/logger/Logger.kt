package com.example.testkmm.android.logger

import com.example.testkmm.android.BuildConfig
import timber.log.Timber

object Logger {

    private val debugTree = AppDebugTree()

    fun initialize() {
        if (BuildConfig.DEBUG) Timber.plant(debugTree)
    }

    fun d(message: String? = null, tag: String? = null) {
        tag?.let {
            setupTag(it)
        }
        debugTree.d(message.toLogMessage())
    }

    fun e(message: String? = null, t: Throwable? = null, tag: String? = null) {
        tag?.let {
            setupTag(tag)
        }
        debugTree.e(t, message.toLogMessage())
    }

    private fun setupTag(tag: String) = Timber.tag(tag)

    private fun String?.toLogMessage() = if (!isNullOrEmpty()) this else "Invoke"
}
