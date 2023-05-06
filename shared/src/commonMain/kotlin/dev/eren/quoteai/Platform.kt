package dev.eren.quoteai

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform