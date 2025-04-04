package io.github.vinicreis.convention.plugin.kotlin.multiplatform.koin

import io.github.vinicreis.convention.config.kotlin.multiplatform.koin.addKoinCompiler
import io.github.vinicreis.convention.config.kotlin.multiplatform.koin.addKoinComposeDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.koin.addKoinCoreDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.koin.addKoinGeneratedSources
import io.github.vinicreis.convention.config.kotlin.multiplatform.koin.addKoinKtorDependencies
import org.gradle.api.Project

abstract class KmpKoinExtension(private val project: Project) {
    init {
        project.addKoinCoreDependencies()
        project.addKoinGeneratedSources()
        project.addKoinCompiler()
    }

    fun compose() {
        project.addKoinComposeDependencies()
    }

    fun ktor() {
        project.addKoinKtorDependencies()
    }

    companion object {
        private const val NAME = "kmpKoin"

        internal fun Project.registerKoinExtension() {
            extensions.create(NAME, KmpKoinExtension::class.java)
        }
    }
}
