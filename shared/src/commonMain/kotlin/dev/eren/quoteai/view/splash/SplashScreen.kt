package dev.eren.quoteai.view.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.eren.quoteai.base.BaseScreen
import dev.eren.quoteai.view.home.HomeScreen
import dev.eren.quoteai.view.persona.PersonaScreen
import kotlinx.coroutines.delay
import org.koin.core.component.inject

/**
 * Created by erenalpaslan on 6.05.2023
 */
class SplashScreen : BaseScreen<SplashViewModel>() {

    override val viewModel: SplashViewModel by inject()

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Screen() {
        val navigator = LocalNavigator.currentOrThrow

        LaunchedEffect(Unit) {
            delay(2_000)
            if (viewModel.isFirstLogin()) {
                navigator.replaceAll(PersonaScreen())
            }else {
                navigator.replaceAll(HomeScreen())
            }
        }

        Scaffold { paddingValues ->
            Box(
                modifier = Modifier.padding(paddingValues).fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("Splash")
            }
        }
    }

}