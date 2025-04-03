package io.github.vinicreis.convention.config.kotlin.multiplatform.js

import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType
import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsTargetDsl

internal fun Project.jsConfig() {
    extensions.configure<KotlinMultiplatformExtension> {
        js()
    }
}

internal fun Project.jsCompilerConfig(
    compiler: KotlinJsCompilerType,
    config: KotlinJsTargetDsl.() -> Unit = { },
) {
    extensions.configure<KotlinMultiplatformExtension> {
        js(compiler, config)
    }
}

@OptIn(ExperimentalWasmDsl::class)
internal fun Project.wasmJsCompilerConfig(
    config: KotlinJsTargetDsl.() -> Unit = { },
) {
    extensions.configure<KotlinMultiplatformExtension> {
        wasmJs(config)
    }
}
