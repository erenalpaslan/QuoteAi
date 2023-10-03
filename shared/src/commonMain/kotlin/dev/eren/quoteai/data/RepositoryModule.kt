package dev.eren.quoteai.data

import dev.eren.quoteai.data.repository.PersonaRepositoryImpl
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 27.05.2023
 */
val repositoryModule = module {
    factory<PersonaRepository> { PersonaRepositoryImpl(get()) }
}