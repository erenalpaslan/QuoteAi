package dev.eren.quoteai.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.IconButton
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

/**
 * Created by erenalpaslan on 6.05.2023
 */
@Composable
fun AppSquaredIconButton(
    icon: @Composable RowScope.() -> Unit,
    onClick: () -> Unit
) {
    Button(
        onClick = {
            onClick()
        },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.size(44.dp),
        contentPadding = PaddingValues(4.dp)
    ) {
        icon()
    }
}