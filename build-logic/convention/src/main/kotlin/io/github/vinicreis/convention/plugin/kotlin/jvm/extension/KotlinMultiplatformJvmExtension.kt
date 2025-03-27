package io.github.vinicreis.convention.plugin.kotlin.jvm.extension

import org.gradle.api.Project
import org.gradle.api.provider.Property

abstract class KotlinMultiplatformJvmExtension(project: Project) {
    val mainClass: Property<String> = project.objects.property(String::class.java)

    companion object {
        private const val NAME = "multiplatformJvm"

        fun Project.registerKotlinMultiplatformExtension(): KotlinMultiplatformJvmExtension {
            return extensions.create(NAME, KotlinMultiplatformJvmExtension::class.java)
        }
    }
}
