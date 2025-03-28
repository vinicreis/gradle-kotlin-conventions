package io.github.vinicreis.convention.plugin.kotlin.multiplatform.js

import io.github.vinicreis.convention.config.kotlin.multiplatform.js.jsCompilerConfig
import io.github.vinicreis.convention.config.kotlin.multiplatform.js.jsConfig
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType
import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsTargetDsl

abstract class KmpJsExtension(private val project: Project) {
    val IR: KotlinJsCompilerType
        get() = project.extensions.getByType<KotlinMultiplatformExtension>().IR

    fun default() {
        project.jsConfig()
    }

    fun compiler(
        compiler: KotlinJsCompilerType? = null,
        config: KotlinJsTargetDsl.() -> Unit = { },
    ) {
        compiler
            ?.also { project.jsCompilerConfig(it, config) }
            ?: default()
    }

    companion object {
        private const val NAME = "kmpJs"

        internal fun Project.registerKmpJsExtension(): KmpJsExtension {
            return extensions.create(NAME, KmpJsExtension::class.java)
        }
    }
}
