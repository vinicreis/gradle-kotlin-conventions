package io.github.vinicreis.convention.plugin.kotlin.multiplatform.jvm

import io.github.vinicreis.convention.config.kotlin.multiplatform.jvm.addJvmPlugins
import io.github.vinicreis.convention.config.kotlin.multiplatform.jvm.configureJvm
import io.github.vinicreis.convention.plugin.kotlin.multiplatform.jvm.KmpJvmExtension.Companion.registerKotlinMultiplatformExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

@OptIn(ExperimentalKotlinGradlePluginApi::class)
class KmpJvmLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            addJvmPlugins()
            registerKotlinMultiplatformExtension()
            configureJvm()
        }
    }
}
