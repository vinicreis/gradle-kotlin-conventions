package io.github.vinicreis.convention.model

internal object Version {
    const val JVM_TOOLCHAIN = 17
}

internal object PluginId {
    const val CONVENTIONS_KMP = "io.github.vinicreis.convention.kmp.core"
    const val KOTLIN_MULTIPLATFORM = "org.jetbrains.kotlin.multiplatform"
    const val KOTLIN_SERIALIZATION = "org.jetbrains.kotlin.plugin.serialization"
    const val KOTLIN_COMPOSE = "org.jetbrains.kotlin.plugin.compose"
    const val KTOR = "io.ktor.plugin"
    const val COMPOSE = "org.jetbrains.compose"
    const val GOOGLE_KSP = "com.google.devtools.ksp"
}

internal object LibraryAlias {
    object KotlinX {
        const val COROUTINES_CORE = "kotlinx.coroutines.core"
        const val SERIALIZATION_JSON = "kotlinx.serialization.json"
        const val DATETIME = "kotlinx.datetime"
    }

    object Compose {
        const val NAVIGATION = "androidx.compose.navigation"
        const val SHIMMER = "valentinilk.compose.shimmer"
    }

    object Ktor {
        const val SERIALIZATION_JSON = "ktor.serialization.json"

        object Server {
            const val CORE = "ktor.server.core"
            const val CONFIG_YAML = "ktor.server.config.yaml"
            const val NETTY = "ktor.server.netty"
            const val AUTH = "ktor.server.auth"
            const val CORS = "ktor.server.cors"
            const val CONTENT_NEGOTIATION = "ktor.server.content.negotiation"
            const val CALL_LOGGING = "ktor.server.call.logging"

            object Logging {
                const val LOGBACK = "logback"
                const val LOG4J_CORE = "log4j.core"
                const val LOG4J_PLUGINS = "log4j.plugins"
                const val LOG4J_API = "log4j.api"
                const val LOG4J_SLF4J = "log4j.slf4j"
                const val SLF4J_API = "slf4j.api"
                const val SLF4J_SIMPLE = "slf4j.simple"
                const val LOG4J_YAML = "jackson.dataformat.yaml"
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

    object Koin {
        const val BOM = "koin.bom"
        const val CORE = "koin.core"
        const val ANNOTATIONS_BOM = "koin.annotations.bom"
        const val ANNOTATIONS = "koin.annotations"
        const val KSP_COMPILER = "koin.ksp.compiler"
        const val COMPOSE = "koin.compose"
        const val COMPOSE_VIEW_MODEL = "koin.compose.viewmodel"
        const val COMPOSE_VIEW_MODEL_NAVIGATION = "koin.compose.viewmodel.navigation"
        const val KTOR = "koin.ktor"
        const val LOGGER_SLF4J = "koin.logger.slf4j"
    }
}
