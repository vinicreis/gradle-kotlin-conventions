package io.github.vinicreis.convention.plugin.kotlin.multiplatform

import io.github.vinicreis.convention.config.kotlin.configureCompiler
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

@OptIn(ExperimentalKotlinGradlePluginApi::class)
class KotlinMultiplatformLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            configure<KotlinMultiplatformExtension> {
                configureCompiler()
            }
        }
    }
}