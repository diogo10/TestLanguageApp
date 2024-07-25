package com.motors.testlanguageapp

import android.app.Application
import android.content.res.Configuration
import java.util.Locale


class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setLocaleBasedOnFlavor()
    }

    private fun setLocaleBasedOnFlavor() {
        val locale = Locale("es")
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
    }
}