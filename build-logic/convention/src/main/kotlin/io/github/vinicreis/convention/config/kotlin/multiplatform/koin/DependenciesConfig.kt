package io.github.vinicreis.convention.config.kotlin.multiplatform.koin

import io.github.vinicreis.convention.extension.commonMain
import io.github.vinicreis.convention.extension.jvmMain
import io.github.vinicreis.convention.extension.library
import io.github.vinicreis.convention.extension.libs
import io.github.vinicreis.convention.model.LibraryAlias
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

internal fun Project.addKoinCoreDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Koin.CORE))
            api(libs.library(LibraryAlias.Koin.ANNOTATIONS))
        }
    }
}

internal fun Project.addKoinComposeDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Koin.COMPOSE))
            implementation(libs.library(LibraryAlias.Koin.COMPOSE_VIEW_MODEL))
            implementation(libs.library(LibraryAlias.Koin.COMPOSE_VIEW_MODEL_NAVIGATION))
        }
    }
}

internal fun Project.addKoinKtorDependencies() {
    jvmMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Koin.KTOR))
            implementation(libs.library(LibraryAlias.Koin.LOGGER_SLF4J))
        }
    }
}

internal fun Project.addKoinGeneratedSources() {
    commonMain {
        kotlin.srcDir("build/generated/ksp/metadata/commonMain/kotlin")
    }
}

internal fun Project.addKoinCompiler() {
    dependencies {
        add("kspCommonMainMetadata", libs.library(LibraryAlias.Koin.KSP_COMPILER))
    }
}

internal fun Project.addKoinCompilerOnJvm() {
    extensions.configure<KotlinMultiplatformExtension> {
        dependencies {
            sourceSets.findByName("jvmMain")?.also {
                "kspJvm"(libs.library(LibraryAlias.Koin.KSP_COMPILER))
            }
        }
    }
}

internal fun Project.addKoinCompilerOnJs() {
    extensions.configure<KotlinMultiplatformExtension> {
        dependencies {
            sourceSets.findByName("jsMain")?.also {
                "kspJs"(libs.library(LibraryAlias.Koin.KSP_COMPILER))
            }
        }
    }
}
