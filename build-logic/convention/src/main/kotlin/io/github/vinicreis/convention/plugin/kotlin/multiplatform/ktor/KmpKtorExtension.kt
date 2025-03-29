package io.github.vinicreis.convention.plugin.kotlin.multiplatform.ktor

import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorClientContentNegotiationDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorClientCoreDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorClientJsHttpDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorClientJvmHttpDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorClientLoggingDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorJsonDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorServerAuthenticationDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorServerContentNegotiationDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorServerCoreDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorServerCorsDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorServerLog4jDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorServerNettyDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.ktor.addKtorServerSlf4JDependencies
import io.github.vinicreis.convention.plugin.kotlin.multiplatform.ktor.KmpKtorExtension.ClientExtension.Companion.registerClientExtension
import io.github.vinicreis.convention.plugin.kotlin.multiplatform.ktor.KmpKtorExtension.ServerExtension.Companion.registerKtorServerExtension
import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.getByType

@Suppress("unused")
abstract class KmpKtorExtension(private val project: Project) : ExtensionAware {
    abstract class ServerExtension(private val project: Project) {
        class ContentNegotiationDsl internal constructor(private val project: Project) {
            init {
                project.addKtorServerContentNegotiationDependencies()
            }

            fun json() {
                project.addKtorJsonDependencies()
            }
        }

        class LoggingDsl internal constructor(private val project: Project) {
            init {
                project.addKtorServerSlf4JDependencies()
            }

            fun log4j() {
                project.addKtorServerLog4jDependencies()
            }
        }

        init {
            project.addKtorServerCoreDependencies()
        }

        fun netty() {
            project.addKtorServerNettyDependencies()
        }

        fun authentication() {
            project.addKtorServerAuthenticationDependencies()
        }

        fun cors() {
            project.addKtorServerCorsDependencies()
        }

        fun contentNegotiation(configure: ContentNegotiationDsl.() -> Unit) {
            ContentNegotiationDsl(project).configure()
        }

        fun logging(configure: LoggingDsl.() -> Unit) {
            LoggingDsl(project).configure()
        }

        companion object {
            private const val NAME = "server"

            internal fun Project.registerKtorServerExtension() {
                extensions.create(NAME, ServerExtension::class.java)
            }
        }
    }

    abstract class ClientExtension(private val project: Project) : ExtensionAware {
        class ContentNegotiationDsl internal constructor(private val project: Project) {
            init {
                project.addKtorClientContentNegotiationDependencies()
            }

            fun json() {
                project.addKtorJsonDependencies()
            }

            companion object {
                private const val NAME = "contentNegotiation"
            }
        }

        init {
            project.addKtorClientCoreDependencies()
        }

        fun jvm() {
            project.addKtorClientJvmHttpDependencies()
        }

        fun js() {
            project.addKtorClientJsHttpDependencies()
        }

        fun logging() {
            project.addKtorClientLoggingDependencies()
        }

        fun contentNegotiation(configure: ContentNegotiationDsl.() -> Unit) {
            ContentNegotiationDsl(project).configure()
        }

        companion object {
            private const val NAME = "client"

            internal val Project.kmpKtorClientExtension: ClientExtension
                get() = kmpKtorExtension.extensions.getByType<ClientExtension>()

            internal fun Project.registerClientExtension() {
                kmpKtorExtension.extensions.create(NAME, ClientExtension::class.java)
            }
        }
    }

    companion object {
        private const val NAME = "kmpKtor"

        internal val Project.kmpKtorExtension: KmpKtorExtension
            get() = extensions.getByType<KmpKtorExtension>()

        internal fun Project.registerKpmKtorExtension() {
            extensions.create(NAME, KmpKtorExtension::class.java)

            registerClientExtension()
            registerKtorServerExtension()
        }
    }
}
