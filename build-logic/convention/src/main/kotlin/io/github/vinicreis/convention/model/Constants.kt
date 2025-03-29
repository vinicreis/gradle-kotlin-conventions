package io.github.vinicreis.convention.model

internal object Version {
    const val JVM_TOOLCHAIN = 17
}

internal object PluginId {
    const val CONVENTIONS_KMP = "io.github.vinicreis.convention.kmp.core"
    const val KOTLIN_MULTIPLATFORM = "org.jetbrains.kotlin.multiplatform"
    const val KOTLIN_SERIALIZATION = "org.jetbrains.kotlin.plugin.serialization"
    const val KOTLIN_COMPOSE = "org.jetbrains.kotlin.plugin.compose"
    const val COMPOSE = "org.jetbrains.compose"
}

internal object LibraryAlias {
    object KotlinX {
        const val COROUTINES_CORE = "kotlinx.coroutines.core"
        const val SERIALIZATION_JSON = "kotlin.serialization.json"
    }

    object Compose {
        const val NAVIGATION = "androidx.compose.navigation"
        const val SHIMMER = "valentinilk.compose.shimmer"
    }

    object Ktor {
        const val SERIALIZATION_JSON = "ktor.serialization.json"

        object Server {
            const val CORE = "ktor.server.core"
            const val NETTY = "ktor.server.netty"
            const val AUTH = "ktor.server.auth"
            const val CORS = "ktor.server.cors"
            const val CONTENT_NEGOTIATION = "ktor.server.content.negotiation"

            object Logging {
                const val LOG4J_CORE = "log4j-core"
                const val LOG4J_API = "log4j-api"
                const val LOG4J_SLF4J = "log4j-slf4j"
                const val SLF4J_API = "slf4j-api"
                const val SLF4J_SIMPLE = "slf4j-simple"
            }
        }

        object Client {
            const val CORE = "ktor.client.core"
            const val CIO_JVM = "ktor.client.cio.jvm"
            const val JS = "ktor.client.js"
            const val LOGGING = "ktor.client.logging"
            const val CONTENT_NEGOTIATION = "ktor.client.content.negotiation"
        }
    }
}
