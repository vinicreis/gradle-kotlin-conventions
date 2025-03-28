package io.github.vinicreis.convention.plugin.kotlin.multiplatform.js

import io.github.vinicreis.convention.config.kotlin.multiplatform.js.addJsPlugins
import io.github.vinicreis.convention.plugin.kotlin.multiplatform.js.KmpJsExtension.Companion.registerKmpJsExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

@OptIn(ExperimentalKotlinGradlePluginApi::class)
class KmpJsLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            addJsPlugins()
            registerKmpJsExtension()
        }
    }
}
