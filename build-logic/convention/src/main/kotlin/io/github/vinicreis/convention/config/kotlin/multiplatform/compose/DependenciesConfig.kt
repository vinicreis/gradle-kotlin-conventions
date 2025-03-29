package io.github.vinicreis.convention.config.kotlin.multiplatform.compose

import io.github.vinicreis.convention.extension.commonMain
import io.github.vinicreis.convention.extension.library
import io.github.vinicreis.convention.extension.libs
import io.github.vinicreis.convention.model.LibraryAlias
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.compose.ComposeExtension

private val Project.composeDependencies
    get() = extensions.getByType<ComposeExtension>().dependencies

internal fun Project.addCoreComposeDependencies() {
    commonMain {
        dependencies {
            implementation(composeDependencies.ui)
            implementation(composeDependencies.foundation)
            implementation(composeDependencies.material3)
        }
    }
}

internal fun Project.addNavigationComposeDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Compose.NAVIGATION))
        }
    }
}

internal fun Project.addResourcesComposeDependencies() {
    commonMain {
        dependencies {
            implementation(composeDependencies.components.resources)
        }
    }
}

internal fun Project.addPreviewComposeDependencies() {
    commonMain {
        dependencies {
            implementation(composeDependencies.components.uiToolingPreview)
        }
    }
}

internal fun Project.addMaterialIconsComposeDependencies() {
    commonMain {
        dependencies {
            implementation(composeDependencies.materialIconsExtended)
        }
    }
}

internal fun Project.addShimmerComposeDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Compose.SHIMMER))
        }
    }
}
