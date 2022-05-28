package com.example.testkmm.android.logger

import timber.log.Timber

internal class AppDebugTree : Timber.DebugTree() {

    override fun createStackElementTag(element: StackTraceElement) =
        "(${element.fileName}:${element.lineNumber}) [M:${element.methodName}]"
}
