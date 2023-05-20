package dev.eren.quoteai.view.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dev.eren.quoteai.base.BaseScreen
import org.koin.core.component.inject

/**
 * Created by erenalpaslan on 8.05.2023
 */
class ThemesScreen: BaseScreen<ThemesViewModel>() {

    override val viewModel: ThemesViewModel by inject()

    @Composable
    override fun Screen() {
        Column(modifier = Modifier.fillMaxSize()) {
            Text("Themes")
        }
    }
}