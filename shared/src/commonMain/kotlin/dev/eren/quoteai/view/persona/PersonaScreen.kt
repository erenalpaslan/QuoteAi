package dev.eren.quoteai.view.persona

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.eren.quoteai.base.BaseScreen
import dev.eren.quoteai.view.home.HomeScreen
import org.koin.core.component.inject

/**
 * Created by erenalpaslan on 6.05.2023
 */
class PersonaScreen: BaseScreen<PersonaViewModel>() {
    override val viewModel: PersonaViewModel by inject()

    @Composable
    override fun Screen() {
        val navigator = LocalNavigator.currentOrThrow

        PersonaSelectionContent(
            onNextClicked = {
                viewModel.onPersonaSelected()
                navigator.replaceAll(HomeScreen())
            }
        )
    }

}