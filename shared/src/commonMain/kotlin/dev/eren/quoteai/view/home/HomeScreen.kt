package dev.eren.quoteai.view.home

import androidx.compose.runtime.Composable
import dev.eren.quoteai.base.BaseScreen
import org.koin.core.component.inject

/**
 * Created by erenalpaslan on 6.05.2023
 */
class HomeScreen: BaseScreen<HomeViewModel>() {

    override val viewModel: HomeViewModel by inject()

    @Composable
    override fun Screen() {
        HomeContent()
    }

}