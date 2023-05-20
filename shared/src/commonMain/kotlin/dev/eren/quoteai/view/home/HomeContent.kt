package dev.eren.quoteai.view.home

import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.eren.quoteai.view.home.components.HomeBottomActions
import dev.eren.quoteai.view.home.components.HomeTopBar
import org.jetbrains.compose.resources.ExperimentalResourceApi

/**
 * Created by erenalpaslan on 7.05.2023
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeContent() {
    Scaffold { paddingValues ->
        Box(
            modifier = Modifier.padding(paddingValues).fillMaxSize(),
        ) {
            Text("Main", modifier = Modifier.align(Alignment.Center))
            HomeBottomActions(modifier = Modifier.align(Alignment.BottomCenter))
        }
    }
}