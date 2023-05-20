package dev.eren.quoteai.view.theme

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 8.05.2023
 */
val themesModule = module {
    factoryOf(::ThemesViewModel)
}