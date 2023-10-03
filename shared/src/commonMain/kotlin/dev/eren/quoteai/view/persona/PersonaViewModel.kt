package dev.eren.quoteai.view.persona

import com.russhwolf.settings.ExperimentalSettingsApi
import com.russhwolf.settings.serialization.decodeValue
import com.russhwolf.settings.serialization.encodeValue
import com.russhwolf.settings.set
import dev.eren.quoteai.base.BaseViewModel
import dev.eren.quoteai.data.entity.QPersona
import dev.eren.quoteai.utils.SettingKeys
import dev.eren.quoteai.utils.settings
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.serializer

/**
 * Created by erenalpaslan on 7.05.2023
 */
@OptIn(ExperimentalSerializationApi::class, ExperimentalSettingsApi::class)
class PersonaViewModel: BaseViewModel() {

    private val _uiState: MutableStateFlow<PersonaUiState> = MutableStateFlow(PersonaUiState.Loading)
    val uiState = _uiState.asStateFlow()

    init {
        settings.decodeValue(
            serializer<QPersona?>(),
            SettingKeys.SELECTED_PERSONA,
            null
        )?.let {_ ->
            _uiState.update {
                PersonaUiState.OnDataLoaded(selectedIndex = 3)
            }
        }
    }

    fun onPersonaSelected(persona: QPersona) {
        settings.encodeValue(serializer<QPersona>(), SettingKeys.SELECTED_PERSONA, persona)
    }

}