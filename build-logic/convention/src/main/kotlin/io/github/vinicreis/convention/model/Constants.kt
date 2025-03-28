package io.github.vinicreis.convention.model

internal object Version {
    const val JVM_TOOLCHAIN = 17
}

internal object PluginId {
    const val CONVENTIONS_KMP = "io.github.vinicreis.convention.kmp.core"
    const val KOTLIN_MULTIPLATFORM = "org.jetbrains.kotlin.multiplatform"
    const val KOTLIN_SERIALIZATION = "org.jetbrains.kotlin.plugin.serialization"
}

internal object LibraryAlias {
    object KotlinX {
        const val COROUTINES_CORE = "kotlinx.coroutines.core"
        const val SERIALIZATION_JSON = "kotlin.serialization.json"
    }
}
