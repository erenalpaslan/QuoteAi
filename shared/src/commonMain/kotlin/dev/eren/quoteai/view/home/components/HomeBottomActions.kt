package dev.eren.quoteai.view.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.eren.quoteai.common.Icons
import dev.eren.quoteai.components.AppSquaredIconButton
import dev.eren.quoteai.view.persona.PersonaScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

/**
 * Created by erenalpaslan on 8.05.2023
 */
@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomeBottomActions() {
    val navigator = LocalNavigator.currentOrThrow

    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = {
                navigator.push(PersonaScreen())
            },
            shape = MaterialTheme.shapes.medium,
            contentPadding = PaddingValues(horizontal = 8.dp)
        ) {
            Icon(painterResource(Icons.Category), null)
            Spacer(Modifier.width(4.dp))
            Text(
                text = "Intergalactic Commander",
                style = MaterialTheme.typography.labelSmall,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                modifier = Modifier.fillMaxWidth(0.3f)
            )
        }
        Row {
            AppSquaredIconButton(
                icon = {
                    Icon(painterResource(Icons.Brush), null)
                }
            ) {

            }
            Spacer(Modifier.width(4.dp))
            AppSquaredIconButton(
                icon = {
                    Icon(painterResource(Icons.Profile), null)
                }
            ) {

            }
        }
    }
}