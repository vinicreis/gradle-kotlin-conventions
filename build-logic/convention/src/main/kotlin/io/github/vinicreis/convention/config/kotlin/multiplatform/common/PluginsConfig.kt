package io.github.vinicreis.convention.config.kotlin.multiplatform.common

import io.github.vinicreis.convention.model.PluginId
import org.gradle.api.Project

internal fun Project.addCommonPlugins() {
    pluginManager.apply(PluginId.KOTLIN_MULTIPLATFORM)
    pluginManager.apply(PluginId.KOTLIN_SERIALIZATION)
}
