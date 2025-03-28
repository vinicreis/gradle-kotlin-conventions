package io.github.vinicreis.convention.config.kotlin.multiplatform.compose

import io.github.vinicreis.convention.model.PluginId
import org.gradle.api.Project

internal fun Project.addKmpComposePlugins() {
    pluginManager.apply {
        apply(PluginId.CONVENTIONS_KMP)
        apply(PluginId.KOTLIN_COMPOSE)
        apply(PluginId.COMPOSE)
    }
}
