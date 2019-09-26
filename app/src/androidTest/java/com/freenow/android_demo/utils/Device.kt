package com.freenow.android_demo.utils

import android.content.Context
import android.content.SharedPreferences
import androidx.test.platform.app.InstrumentationRegistry

private val instrumentation = InstrumentationRegistry.getInstrumentation()
var appContext = instrumentation.targetContext

fun clearPrefs() {
    val PREFS_NAME = "FreeNowPrefs"
    val sharedPref: SharedPreferences = appContext.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    val editor = sharedPref.edit()
        editor.clear()
        editor.apply()
}