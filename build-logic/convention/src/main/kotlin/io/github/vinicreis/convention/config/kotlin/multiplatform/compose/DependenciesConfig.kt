package io.github.vinicreis.convention.config.kotlin.multiplatform.compose

import io.github.vinicreis.convention.extension.commonMain
import io.github.vinicreis.convention.extension.libs
import io.github.vinicreis.convention.model.LibraryAlias
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.compose.ComposeExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

private val Project.composeDependencies
    get() = extensions.getByType<ComposeExtension>().dependencies

internal fun Project.addCoreComposeDependencies() {
    extensions.configure<KotlinMultiplatformExtension> {
        commonMain {
            dependencies {
                implementation(composeDependencies.ui)
                implementation(composeDependencies.foundation)
                implementation(composeDependencies.material3)
            }
        }
    }
}

internal fun Project.addNavigationComposeDependencies() {
    extensions.configure<KotlinMultiplatformExtension> {
        commonMain {
            dependencies {
                implementation(libs.findLibrary(LibraryAlias.Compose.NAVIGATION).get())
            }
        }
    }
}

internal fun Project.addResourcesComposeDependencies() {
    extensions.configure<KotlinMultiplatformExtension> {
        commonMain {
            dependencies {
                implementation(composeDependencies.components.resources)
            }
        }
    }
}

internal fun Project.addPreviewComposeDependencies() {
    extensions.configure<KotlinMultiplatformExtension> {
        commonMain {
            dependencies {
                implementation(composeDependencies.components.uiToolingPreview)
            }
        }
    }
}

internal fun Project.addMaterialIconsComposeDependencies() {
    extensions.configure<KotlinMultiplatformExtension> {
        commonMain {
            dependencies {
                implementation(composeDependencies.materialIconsExtended)
            }
        }
    }
}

internal fun Project.addShimmerComposeDependencies() {
    extensions.configure<KotlinMultiplatformExtension> {
        commonMain {
            dependencies {
                implementation(libs.findLibrary(LibraryAlias.Compose.SHIMMER).get())
            }
        }
    }
}
