package io.github.vinicreis.convention.plugin.kotlin.jvm

import io.github.vinicreis.convention.model.PluginId
import io.github.vinicreis.convention.plugin.kotlin.jvm.extension.KotlinMultiplatformJvmExtension
import io.github.vinicreis.convention.plugin.kotlin.jvm.extension.KotlinMultiplatformJvmExtension.Companion.registerKotlinMultiplatformExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.getByType
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

@OptIn(ExperimentalKotlinGradlePluginApi::class)
class JvmMultiplatformLibraryPlugin : Plugin<Project> {
    private val Project.jvmExtension: KotlinMultiplatformJvmExtension
        get() = extensions.getByType<KotlinMultiplatformJvmExtension>()

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply(PluginId.KOTLIN_MULTIPLATFORM)
            }

            registerKotlinMultiplatformExtension()

            configure<KotlinMultiplatformExtension> {
                jvm {
                    afterEvaluate {
                        jvmExtension.mainClass.orNull?.also { mainClassName ->
                            binaries {
                                executable {
                                    mainClass.set(mainClassName)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}