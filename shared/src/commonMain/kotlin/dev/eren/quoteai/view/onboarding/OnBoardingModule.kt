package dev.eren.quoteai.view.onboarding

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 22.05.2023
 */
val onBoardingModule = module {
    factoryOf(::OnBoardingViewModel)
}