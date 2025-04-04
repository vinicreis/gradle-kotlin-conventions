package io.github.vinicreis.convention.plugin.kotlin.multiplatform.core

import io.github.vinicreis.convention.config.kotlin.multiplatform.common.addCommonDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.common.addCommonPlugins
import io.github.vinicreis.convention.config.kotlin.multiplatform.core.configureCompiler
import io.github.vinicreis.convention.config.kotlin.multiplatform.core.toggleSourcePublication
import io.github.vinicreis.convention.task.core.configureVersionTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

@Suppress("unused")
@OptIn(ExperimentalKotlinGradlePluginApi::class)
class KmpCoreLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            addCommonPlugins()
            configureCompiler()
            toggleSourcePublication(enable = true)
            addCommonDependencies()
            configureVersionTask()
        }
    }
}