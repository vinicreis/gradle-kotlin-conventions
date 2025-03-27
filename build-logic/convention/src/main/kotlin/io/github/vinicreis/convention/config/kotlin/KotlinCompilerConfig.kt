package io.github.vinicreis.convention.config.kotlin

import io.github.vinicreis.convention.model.Version
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

internal fun KotlinMultiplatformExtension.configureCompiler() {
    compilerOptions {
        jvmToolchain(Version.JVM_TOOLCHAIN)
    }
}
