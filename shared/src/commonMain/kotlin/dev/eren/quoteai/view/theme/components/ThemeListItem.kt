package dev.eren.quoteai.view.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Created by erenalpaslan on 20.05.2023
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThemeListItem(
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .width(110.dp)
            .height(190.dp)
            .padding(4.dp),
        shape = MaterialTheme.shapes.small
    ) {
        Box(modifier = Modifier.background(Color.Magenta).fillMaxSize())
    }
}