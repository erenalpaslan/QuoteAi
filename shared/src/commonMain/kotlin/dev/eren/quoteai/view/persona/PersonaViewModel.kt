package dev.eren.quoteai.view.persona

import com.russhwolf.settings.set
import dev.eren.quoteai.base.BaseViewModel
import dev.eren.quoteai.utils.SettingKeys
import dev.eren.quoteai.utils.settings

/**
 * Created by erenalpaslan on 7.05.2023
 */
class PersonaViewModel: BaseViewModel() {


    fun onPersonaSelected() {
        settings[SettingKeys.IS_FIRST_LOGIN] = false
    }

}