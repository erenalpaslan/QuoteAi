package dev.eren.quoteai.android

import android.app.Application
import dev.eren.quoteai.di.appModules
import dev.eren.quoteai.view.home.homeModule
import dev.eren.quoteai.view.persona.personaModule
import dev.eren.quoteai.view.splash.splashModule
import org.koin.core.context.startKoin

/**
 * Created by erenalpaslan on 7.05.2023
 */
class QuoteApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            this.modules(appModules)
        }
    }

}