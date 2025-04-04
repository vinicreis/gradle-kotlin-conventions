package io.github.vinicreis.convention.extension

import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

internal fun Project.commonMain(
    configure: KotlinSourceSet.() -> Unit,
) {
    extensions.configure<KotlinMultiplatformExtension> {
        sourceSets.named("commonMain").configure(configure)
    }
}

internal fun Project.jvmMain(
    configure: KotlinSourceSet.() -> Unit,
) {
    extensions.configure<KotlinMultiplatformExtension> {
        sourceSets.named("jvmMain").configure(configure)
    }
}

internal fun Project.jsMain(
    configure: KotlinSourceSet.() -> Unit,
) {
    extensions.configure<KotlinMultiplatformExtension> {
        sourceSets.named("wasmJsMain").configure(configure)
    }
}
