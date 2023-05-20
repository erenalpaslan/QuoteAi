package dev.eren.quoteai.view.profile

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 8.05.2023
 */
val profileModule = module {
    factoryOf(::ProfileViewModel)
}