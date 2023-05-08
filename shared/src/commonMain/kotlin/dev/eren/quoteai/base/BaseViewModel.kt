package dev.eren.quoteai.base

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import kotlinx.coroutines.SupervisorJob

/**
 * Created by erenalpaslan on 7.05.2023
 */
open class BaseViewModel {
    val progressVisible: MutableState<Boolean> = mutableStateOf(false)

    fun showProgress() {
        progressVisible.value = true
    }

    fun hideProgress() {
        progressVisible.value = false
    }

}