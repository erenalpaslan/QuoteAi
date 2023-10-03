package dev.eren.quoteai.data.database

import dev.eren.quoteai.data.entity.Persona
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 27.05.2023
 */
val realmModule = module {
    single {
        val config = RealmConfiguration.create(
            schema = setOf(
                Persona::class
            )
        )
        Realm.open(config)
    }
}