package io.github.vinicreis.convention.plugin.kotlin.multiplatform.compose

import io.github.vinicreis.convention.config.kotlin.multiplatform.compose.addKmpComposePlugins
import io.github.vinicreis.convention.plugin.kotlin.multiplatform.compose.KmpComposeExtension.Companion.registerKpmComposeExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
class KmpComposeLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            addKmpComposePlugins()
            registerKpmComposeExtension()
        }
    }
}
