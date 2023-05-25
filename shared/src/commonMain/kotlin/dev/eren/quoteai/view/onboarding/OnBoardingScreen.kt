package dev.eren.quoteai.view.onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.eren.quoteai.base.BaseScreen
import org.koin.core.component.inject

/**
 * Created by erenalpaslan on 22.05.2023
 */
class OnBoardingScreen: BaseScreen<OnBoardingViewModel>() {

    override val viewModel: OnBoardingViewModel by inject()

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Screen() {
        Scaffold {
            Column(modifier = Modifier.padding(it)) {
                Text("OnBoarding")
            }
        }
    }

}