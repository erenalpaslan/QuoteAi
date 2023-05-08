package dev.eren.quoteai.base

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

/**
 * Created by erenalpaslan on 7.05.2023
 */
abstract class BaseScreen<VM: BaseViewModel>: Screen, KoinComponent {
    abstract val viewModel: VM

    @Composable
    fun ScreenBase(viewModel: VM) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Screen()

            if (viewModel.progressVisible.value){
                CircularProgressIndicator()
            }
        }

    }

    @Composable
    abstract fun Screen()

    @Composable
    override fun Content() {
        ScreenBase(viewModel)
    }
}