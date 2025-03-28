package io.github.vinicreis.convention.extension

import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

internal fun KotlinMultiplatformExtension.commonMain(
    configure: KotlinSourceSet.() -> Unit,
) {
    sourceSets.named("commonMain").configure(configure)
}
