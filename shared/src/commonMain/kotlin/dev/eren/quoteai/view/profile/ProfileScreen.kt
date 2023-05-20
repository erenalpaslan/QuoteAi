package dev.eren.quoteai.view.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import dev.eren.quoteai.base.BaseScreen
import dev.eren.quoteai.common.Icons
import dev.eren.quoteai.view.profile.components.FieldWithTitle
import dev.eren.quoteai.view.profile.components.ProfileFieldItem
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.koin.core.component.inject

/**
 * Created by erenalpaslan on 8.05.2023
 */
class ProfileScreen: BaseScreen<ProfileViewModel>() {

    override val viewModel: ProfileViewModel by inject()

    @OptIn(ExperimentalMaterial3Api::class, ExperimentalResourceApi::class)
    @Composable
    override fun Screen() {
        val scrollState = rememberScrollState()
        val navigator = LocalNavigator.currentOrThrow

        Scaffold(
            topBar = {
                TopAppBar(title = {
                    Text(text = "Motivation")
                },
                    navigationIcon = {
                        IconButton(onClick = {
                            navigator.pop()
                        }) {
                            Icon(imageVector = androidx.compose.material.icons.Icons.Rounded.Close, null)
                        }
                    })
            }
        ) {paddingValues ->
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(scrollState)
            ) {
                FieldWithTitle(title = "GENERAL") {
                    ProfileFieldItem(
                        icon = {
                            Icon(painter = painterResource(Icons.Diamond), null)
                        },
                        text = "Premium",
                        tail = {
                            Icon(painter = painterResource(Icons.ArrowRight), null)
                        }
                    )
                    Divider()
                    ProfileFieldItem(
                        icon = {
                            Icon(painter = painterResource(Icons.Language), null)
                        },
                        text = "Language",
                        tail = {
                            Icon(painter = painterResource(Icons.ArrowRight), null)
                        }
                    )
                }
                FieldWithTitle(title = "YOUR QUOTES") {
                    ProfileFieldItem(
                        icon = {
                            Icon(painter = painterResource(Icons.Favorite), null)
                        },
                        text = "Favorites",
                        tail = {
                            Icon(painter = painterResource(Icons.ArrowRight), null)
                        }
                    )
                    Divider()
                    ProfileFieldItem(
                        icon = {
                            Icon(painter = painterResource(Icons.Quotes), null)
                        },
                        text = "Seen quotes",
                        tail = {
                            Icon(painter = painterResource(Icons.ArrowRight), null)
                        }
                    )
                }
                FieldWithTitle(title = "HELP") {
                    ProfileFieldItem(
                        icon = {
                            Icon(painter = painterResource(Icons.Sms), null)
                        },
                        text = "Feedback"
                    )
                    Divider()
                    ProfileFieldItem(
                        icon = {
                            Icon(painter = painterResource(Icons.Star), null)
                        },
                        text = "Rate us"
                    )
                }
                FieldWithTitle(title = "OTHERS") {
                    ProfileFieldItem(
                        icon = {
                            Icon(painter = painterResource(Icons.Shield), null)
                        },
                        text = "Privacy policy",
                        tail = {
                            Icon(painter = painterResource(Icons.ArrowRight), null)
                        }
                    )
                    Divider()
                    ProfileFieldItem(
                        icon = {
                            Icon(painter = painterResource(Icons.Bill), null)
                        },
                        text = "Terms and conditions",
                        tail = {
                            Icon(painter = painterResource(Icons.ArrowRight), null)
                        }
                    )
                }
            }
        }
    }
}