package io.github.vinicreis.convention.config.kotlin.multiplatform.koin

import io.github.vinicreis.convention.config.kotlin.multiplatform.ksp.addKspPlugins
import org.gradle.api.Project

internal fun Project.addKoinPlugins() {
    addKspPlugins()
}
