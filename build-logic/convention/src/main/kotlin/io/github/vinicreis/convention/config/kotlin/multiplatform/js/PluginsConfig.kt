package io.github.vinicreis.convention.config.kotlin.multiplatform.js

import io.github.vinicreis.convention.model.PluginId
import org.gradle.api.Project

internal fun Project.addJsPlugins() {
    pluginManager.apply(PluginId.CONVENTIONS_KMP)
}
