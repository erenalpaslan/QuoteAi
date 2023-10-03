package dev.eren.quoteai.view.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.eren.quoteai.base.BaseScreen
import dev.eren.quoteai.common.Drawables
import dev.eren.quoteai.common.Strings
import dev.eren.quoteai.view.home.HomeScreen
import dev.eren.quoteai.view.persona.PersonaScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.koin.core.component.inject

/**
 * Created by erenalpaslan on 22.05.2023
 */
class OnBoardingScreen : BaseScreen<OnBoardingViewModel>() {

    override val viewModel: OnBoardingViewModel by inject()

    @OptIn(ExperimentalMaterial3Api::class, ExperimentalResourceApi::class)
    @Composable
    override fun Screen() {
        val navigator = LocalNavigator.currentOrThrow

        Scaffold {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "QuoteAi",
                    style = MaterialTheme.typography.headlineLarge,
                    textAlign = TextAlign.Center
                )
                Image(
                    painter = painterResource(Drawables.Writing),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(0.8f)
                )
                Spacer(Modifier.height(32.dp))
                Text(
                    text = Strings.OnBoarding.TITLE,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = Strings.OnBoarding.DESCRIPTION,
                    textAlign = TextAlign.Center
                )
                Box(modifier = Modifier.fillMaxSize().weight(1f)) {
                    Button(
                        onClick = {
                            viewModel.onGetStartedClicked()
                            navigator.replaceAll(PersonaScreen())
                        },
                        modifier = Modifier.fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .padding(vertical = 32.dp),
                        shape = MaterialTheme.shapes.medium
                    ) {
                        Text(
                            Strings.Button.GET_STARTED,
                            style = MaterialTheme.typography.titleLarge
                        )
                    }
                }
            }
        }
    }

}