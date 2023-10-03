package dev.eren.quoteai.view.persona

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.eren.quoteai.base.BaseScreen
import dev.eren.quoteai.data.entity.QPersona
import dev.eren.quoteai.view.home.HomeScreen
import org.koin.core.component.inject
import org.mongodb.kbson.BsonObjectId

/**
 * Created by erenalpaslan on 6.05.2023
 */
class PersonaScreen: BaseScreen<PersonaViewModel>() {
    override val viewModel: PersonaViewModel by inject()

    @Composable
    override fun Screen() {
        val navigator = LocalNavigator.currentOrThrow
        val uiState by viewModel.uiState.collectAsState()

        PersonaSelectionContent(
            uiState = uiState,
            onNextClicked = {
                viewModel.onPersonaSelected(
                    QPersona(
                        id = BsonObjectId.invoke(),
                        name = it,
                        prompt = "test prompt",
                        isActive = true,
                        createdAt = 123142342342L
                    )
                )
                navigator.replaceAll(HomeScreen())
            }
        )
    }

}