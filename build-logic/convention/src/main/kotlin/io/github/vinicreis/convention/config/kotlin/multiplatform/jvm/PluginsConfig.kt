package io.github.vinicreis.convention.config.kotlin.multiplatform.jvm

import io.github.vinicreis.convention.model.PluginId
import org.gradle.api.Project

internal fun Project.addJvmPlugins() {
    pluginManager.apply(PluginId.CONVENTIONS_KMP)
}
