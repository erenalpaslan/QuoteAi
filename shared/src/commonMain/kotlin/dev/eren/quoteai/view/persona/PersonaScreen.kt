package dev.eren.quoteai.view.persona

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material.icons.rounded.ArrowForwardIos
import androidx.compose.material.icons.rounded.Forward
import androidx.compose.material.icons.rounded.SkipNext
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import dev.eren.quoteai.components.AppButton
import dev.eren.quoteai.components.PersonaSelectionItem

/**
 * Created by erenalpaslan on 6.05.2023
 */
class PersonaScreen: Screen {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        var selectedPersonaIndex by remember {
            mutableStateOf(-1)
        }

        Scaffold(
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Text("QuoteAi")
                    },
                    actions = {
                        if (selectedPersonaIndex != -1) {
                            AppButton(
                                onClick = {

                                }
                            ) {
                                Text("Next")
                                Icon(Icons.Rounded.ArrowForwardIos, contentDescription = "")
                            }
                        }
                    }
                )
            }
        ) {
            Column(modifier = Modifier.padding(it).padding(horizontal = 16.dp)) {
                Text("Choose a persona", style = MaterialTheme.typography.titleLarge)
                Text("Tap the persona which you feel best represent you")
                Spacer(Modifier.height(16.dp))
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2)
                ) {
                    items(10) {
                        PersonaSelectionItem(
                            onClick = {
                                selectedPersonaIndex = it
                            },
                            title = "Item: $it",
                            selected = selectedPersonaIndex == it
                        )
                    }
                }
            }
        }


    }

}