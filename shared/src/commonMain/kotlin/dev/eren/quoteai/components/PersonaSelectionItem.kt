package dev.eren.quoteai.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Created by erenalpaslan on 6.05.2023
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PersonaSelectionItem(
    onClick: () -> Unit,
    title: String,
    selected: Boolean
) {

    Card(
        onClick = {
            onClick()
        },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.size(150.dp).padding(8.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Checkbox(
                    checked = selected,
                    onCheckedChange = {
                        if (it) {
                            onClick()
                        }
                    }
                )
            }
            Text(title)
        }
    }
}