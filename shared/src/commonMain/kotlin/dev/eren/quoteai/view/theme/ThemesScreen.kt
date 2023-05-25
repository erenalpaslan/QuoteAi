package dev.eren.quoteai.view.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.eren.quoteai.base.BaseScreen
import org.koin.core.component.inject

/**
 * Created by erenalpaslan on 8.05.2023
 */
class ThemesScreen: BaseScreen<ThemesViewModel>() {

    override val viewModel: ThemesViewModel by inject()

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Screen() {

        ThemesContent()
    }
}