package io.github.vinicreis.convention.config.kotlin.multiplatform.ksp

import io.github.vinicreis.convention.model.PluginId
import org.gradle.api.Project

internal fun Project.addKspPlugins() {
    pluginManager.apply {
        apply(PluginId.GOOGLE_KSP)
    }
}
