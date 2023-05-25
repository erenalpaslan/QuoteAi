package dev.eren.quoteai.view.onboarding

import com.russhwolf.settings.set
import dev.eren.quoteai.base.BaseViewModel
import dev.eren.quoteai.utils.SettingKeys
import dev.eren.quoteai.utils.settings

/**
 * Created by erenalpaslan on 22.05.2023
 */
class OnBoardingViewModel: BaseViewModel() {

    fun onGetStartedClicked() {
        settings[SettingKeys.IS_FIRST_LOGIN] = false
    }

}