package dev.eren.quoteai.view.splash

import com.russhwolf.settings.get
import dev.eren.quoteai.base.BaseViewModel
import dev.eren.quoteai.data.entity.Persona
import dev.eren.quoteai.utils.SettingKeys
import dev.eren.quoteai.utils.settings
import dev.eren.quoteai.view.home.HomeScreen
import dev.eren.quoteai.view.onboarding.OnBoardingScreen
import dev.eren.quoteai.view.persona.PersonaScreen

/**
 * Created by erenalpaslan on 7.05.2023
 */
class SplashViewModel: BaseViewModel() {

    fun whereToNavigate() = when {
        !settings.getBoolean(SettingKeys.GET_STARTED, false) -> OnBoardingScreen::class
        settings.getString(SettingKeys.SELECTED_PERSONA, "").isEmpty() -> PersonaScreen::class
        else -> HomeScreen::class
    }

}