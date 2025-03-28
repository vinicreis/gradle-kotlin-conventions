package io.github.vinicreis.convention.config.kotlin.multiplatform.jvm

import io.github.vinicreis.convention.plugin.kotlin.multiplatform.jvm.jvmExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

@OptIn(ExperimentalKotlinGradlePluginApi::class)
internal fun Project.configureJvm() {
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
