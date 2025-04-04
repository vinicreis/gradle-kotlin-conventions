package io.github.vinicreis.convention.plugin.kotlin.multiplatform.jvm

import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

abstract class KmpJvmExtension(private val project: Project) {
    fun library() {
        project.extensions.configure<KotlinMultiplatformExtension> {
            jvm()
        }
    }

    @OptIn(ExperimentalKotlinGradlePluginApi::class)
    fun application(mainClass: String) {
        project.extensions.configure<KotlinMultiplatformExtension> {
            jvm {
                binaries {
                    executable {
                        this.mainClass.set(mainClass)
                    }
                }
            }
        }
    }

    companion object {
        private const val NAME = "kmpJvm"

        fun Project.registerKotlinMultiplatformExtension(): KmpJvmExtension {
            return extensions.create(NAME, KmpJvmExtension::class.java)
        }
    }
}
