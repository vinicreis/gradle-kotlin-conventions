package io.github.vinicreis.convention.plugin.kotlin.multiplatform.ktor

import io.github.vinicreis.convention.plugin.kotlin.multiplatform.ktor.KmpKtorExtension.Companion.registerKpmKtorExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
class KmpKtorLibraryPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            registerKpmKtorExtension()
        }
    }
}
