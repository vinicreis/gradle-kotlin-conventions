package io.github.vinicreis.convention.plugin.kotlin.multiplatform.koin

import io.github.vinicreis.convention.config.kotlin.multiplatform.koin.addKoinCompilerOnJs
import io.github.vinicreis.convention.config.kotlin.multiplatform.koin.addKoinCompilerOnJvm
import io.github.vinicreis.convention.config.kotlin.multiplatform.koin.addKoinPlugins
import io.github.vinicreis.convention.plugin.kotlin.multiplatform.koin.KmpKoinExtension.Companion.registerKoinExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
class KvmKoinLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            addKoinPlugins()
            registerKoinExtension()
            addKoinCompilerOnJvm()
            addKoinCompilerOnJs()
        }
    }
}
