package dev.eren.quoteai.view.theme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * Created by erenalpaslan on 20.05.2023
 */

val list = listOf("Urban", "Flower", "Nature", "TR", "Car")
@Composable
fun ThemeList() {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        list.forEach { title ->
            Column {
                Text(
                    text = title,
                    modifier = Modifier.padding(horizontal = 16.dp),
                    style = MaterialTheme.typography.titleLarge
                )
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    items(10) {content ->
                        ThemeListItem() {

                        }
                    }
                }
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}