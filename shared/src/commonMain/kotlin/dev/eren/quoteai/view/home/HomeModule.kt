package dev.eren.quoteai.view.home

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 7.05.2023
 */
val homeModule = module {
    singleOf(::HomeViewModel)
}