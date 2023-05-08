package dev.eren.quoteai.utils

import com.russhwolf.settings.Settings

/**
 * Created by erenalpaslan on 7.05.2023
 */
val settings: Settings = Settings()

object SettingKeys {
    const val USER = "USER"
    const val REQUEST_COUNT = "REQUEST_COUNT"
    const val IS_FIRST_LOGIN = "IS_FIRST_LOGIN"
}