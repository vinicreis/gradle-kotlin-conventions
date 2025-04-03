package io.github.vinicreis.convention.config.kotlin.multiplatform.common

import io.github.vinicreis.convention.extension.commonMain
import io.github.vinicreis.convention.extension.library
import io.github.vinicreis.convention.extension.libs
import io.github.vinicreis.convention.model.LibraryAlias
import org.gradle.api.Project

internal fun Project.addCommonDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.KotlinX.COROUTINES_CORE))
            implementation(libs.library(LibraryAlias.KotlinX.SERIALIZATION_JSON))
            implementation(libs.library(LibraryAlias.KotlinX.DATETIME))
        }
    }
}
