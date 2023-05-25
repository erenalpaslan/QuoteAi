package dev.eren.quoteai.di

import dev.eren.quoteai.view.home.homeModule
import dev.eren.quoteai.view.onboarding.onBoardingModule
import dev.eren.quoteai.view.persona.personaModule
import dev.eren.quoteai.view.profile.profileModule
import dev.eren.quoteai.view.splash.splashModule
import dev.eren.quoteai.view.theme.themesModule
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 8.05.2023
 */
val appModules = module {
    includes(splashModule)
    includes(personaModule)
    includes(homeModule)
    includes(themesModule)
    includes(profileModule)
    includes(onBoardingModule)
}