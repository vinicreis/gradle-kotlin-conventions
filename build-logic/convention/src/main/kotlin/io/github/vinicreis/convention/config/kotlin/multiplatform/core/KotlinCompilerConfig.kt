package io.github.vinicreis.convention.config.kotlin.multiplatform.core

import io.github.vinicreis.convention.model.Version
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

internal fun Project.configureCompiler() {
    extensions.configure<KotlinMultiplatformExtension> {
        compilerOptions {
            jvmToolchain(Version.JVM_TOOLCHAIN)
        }
    }
}

internal fun Project.toggleSourcePublication(enable: Boolean) {
    extensions.configure<KotlinMultiplatformExtension> {
        withSourcesJar(publish = enable)
    }
}
