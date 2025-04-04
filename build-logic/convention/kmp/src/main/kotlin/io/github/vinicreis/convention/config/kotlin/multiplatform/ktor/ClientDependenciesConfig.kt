package io.github.vinicreis.convention.config.kotlin.multiplatform.ktor

import io.github.vinicreis.convention.extension.commonMain
import io.github.vinicreis.convention.extension.jsMain
import io.github.vinicreis.convention.extension.jvmMain
import io.github.vinicreis.convention.extension.library
import io.github.vinicreis.convention.extension.libs
import io.github.vinicreis.convention.model.LibraryAlias
import org.gradle.api.Project

internal fun Project.addKtorClientCoreDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Client.CORE))
        }
    }
}

internal fun Project.addKtorClientContentNegotiationDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Client.CONTENT_NEGOTIATION))
        }
    }
}

internal fun Project.addKtorJsonDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.SERIALIZATION_JSON))
        }
    }
}

internal fun Project.addKtorClientLoggingDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Client.LOGGING))
        }
    }
}

internal fun Project.addKtorClientJvmHttpDependencies() {
    jvmMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Client.CIO_JVM))
        }
    }
}

internal fun Project.addKtorClientJsHttpDependencies() {
    jsMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Client.JS))
        }
    }
}
