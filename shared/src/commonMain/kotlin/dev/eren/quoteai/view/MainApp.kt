package dev.eren.quoteai.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.Navigator
import dev.eren.quoteai.theme.AppTheme
import dev.eren.quoteai.view.splash.SplashScreen

/**
 * Created by erenalpaslan on 6.05.2023
 */
@Composable
fun MainApp() {
    AppTheme {
        Navigator(SplashScreen())
    }
}