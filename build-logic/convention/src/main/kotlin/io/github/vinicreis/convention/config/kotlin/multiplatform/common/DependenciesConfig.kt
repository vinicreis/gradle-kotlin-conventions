package io.github.vinicreis.convention.config.kotlin.multiplatform.common

import io.github.vinicreis.convention.extension.commonMain
import io.github.vinicreis.convention.extension.libs
import io.github.vinicreis.convention.model.LibraryAlias
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

internal fun Project.addCommonDependencies() {
    extensions.configure<KotlinMultiplatformExtension> {
        commonMain {
            dependencies {
                implementation(libs.findLibrary(LibraryAlias.KotlinX.COROUTINES_CORE).get())
                implementation(libs.findLibrary(LibraryAlias.KotlinX.SERIALIZATION_JSON).get())
            }
        }
    }
}
