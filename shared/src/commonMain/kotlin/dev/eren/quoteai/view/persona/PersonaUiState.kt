package dev.eren.quoteai.view.persona

/**
 * Created by erenalpaslan on 7.05.2023
 */
sealed interface PersonaUiState {
    object Loading: PersonaUiState

    data class OnDataLoaded(
        val list: List<String> = emptyList(),
        val selectedIndex: Int = -1
    ): PersonaUiState
}
