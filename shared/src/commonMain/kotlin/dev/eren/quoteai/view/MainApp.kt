package dev.eren.quoteai.view

import androidx.compose.runtime.Composable
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