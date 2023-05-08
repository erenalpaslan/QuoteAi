package dev.eren.quoteai.view.persona

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 7.05.2023
 */
val personaModule = module {
    factoryOf(::PersonaViewModel)
}