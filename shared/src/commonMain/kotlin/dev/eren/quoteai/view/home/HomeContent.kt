package dev.eren.quoteai.view.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.eren.quoteai.view.home.components.HomeBottomActions
import dev.eren.quoteai.view.home.components.HomeTopBar
import org.jetbrains.compose.resources.ExperimentalResourceApi

/**
 * Created by erenalpaslan on 7.05.2023
 */
@OptIn(ExperimentalMaterial3Api::class, ExperimentalResourceApi::class)
@Composable
fun HomeContent() {
    val navigator = LocalNavigator.currentOrThrow

    Scaffold(
        topBar = {
            HomeTopBar()
        }
    ) { paddingValues ->
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier.padding(paddingValues).fillMaxSize()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Text("Main")
            }
            HomeBottomActions()
        }
    }
}