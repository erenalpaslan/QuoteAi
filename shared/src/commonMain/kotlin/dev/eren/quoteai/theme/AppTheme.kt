package dev.eren.quoteai.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.eren.quoteai.theme.AppColors.black
import dev.eren.quoteai.theme.AppColors.darkTeal
import dev.eren.quoteai.theme.AppColors.deepPurple
import dev.eren.quoteai.theme.AppColors.gray200
import dev.eren.quoteai.theme.AppColors.lightGray
import dev.eren.quoteai.theme.AppColors.purple
import dev.eren.quoteai.theme.AppColors.red
import dev.eren.quoteai.theme.AppColors.teal
import dev.eren.quoteai.theme.AppColors.white

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        darkColorScheme(
            primary = purple,
            primaryContainer = deepPurple,
            secondary = teal,
            secondaryContainer = darkTeal,
            background = black,
            surface = black,
            error = red,
            onPrimary = white,
            onSecondary = black,
            onBackground = white,
            onSurface = white,
            onError = white,
            outlineVariant = black
        )
    } else {
        lightColorScheme(
            primary = purple,
            primaryContainer = deepPurple,
            secondary = teal,
            secondaryContainer = darkTeal,
            background = white,
            surface = white,
            error = red,
            onPrimary = white,
            onSecondary = black,
            onBackground = black,
            onSurface = black,
            onError = white
        )
    }

    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}
