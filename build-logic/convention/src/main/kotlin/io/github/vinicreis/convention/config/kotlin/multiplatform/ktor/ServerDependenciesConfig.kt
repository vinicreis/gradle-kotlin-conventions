package io.github.vinicreis.convention.config.kotlin.multiplatform.ktor

import io.github.vinicreis.convention.extension.commonMain
import io.github.vinicreis.convention.extension.library
import io.github.vinicreis.convention.extension.libs
import io.github.vinicreis.convention.model.LibraryAlias
import org.gradle.api.Project

internal fun Project.addKtorServerCoreDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Server.CORE))
        }
    }
}

internal fun Project.addKtorServerNettyDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Server.NETTY))
        }
    }
}

internal fun Project.addKtorServerAuthenticationDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Server.AUTH))
        }
    }
}

internal fun Project.addKtorServerCorsDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Server.CORS))
        }
    }
}

internal fun Project.addKtorServerContentNegotiationDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Server.CONTENT_NEGOTIATION))
        }
    }
}

internal fun Project.addKtorServerSlf4JDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Server.Logging.SLF4J_API))
            implementation(libs.library(LibraryAlias.Ktor.Server.Logging.SLF4J_SIMPLE))
        }
    }
}

internal fun Project.addKtorServerLog4jDependencies() {
    commonMain {
        dependencies {
            implementation(libs.library(LibraryAlias.Ktor.Server.Logging.LOG4J_CORE))
            implementation(libs.library(LibraryAlias.Ktor.Server.Logging.LOG4J_API))
            implementation(libs.library(LibraryAlias.Ktor.Server.Logging.LOG4J_SLF4J))
        }
    }
}
