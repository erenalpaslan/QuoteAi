package dev.eren.quoteai.view.splash

import dev.eren.quoteai.base.BaseViewModel
import dev.eren.quoteai.utils.SettingKeys
import dev.eren.quoteai.utils.settings

/**
 * Created by erenalpaslan on 7.05.2023
 */
class SplashViewModel: BaseViewModel() {

    fun isFirstLogin() = settings.getBoolean(SettingKeys.IS_FIRST_LOGIN, true)

}