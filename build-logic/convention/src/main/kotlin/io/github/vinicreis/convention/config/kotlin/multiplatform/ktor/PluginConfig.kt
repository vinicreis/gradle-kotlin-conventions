package io.github.vinicreis.convention.config.kotlin.multiplatform.ktor

import io.github.vinicreis.convention.model.PluginId
import org.gradle.api.Project

internal fun Project.addKtorPlugin() {
    pluginManager.apply(PluginId.KTOR)
}
