package io.github.vinicreis.convention.plugin.kotlin.multiplatform.jvm

import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.getByType

internal val Project.jvmExtension: KmpJvmExtension
    get() = extensions.getByType<KmpJvmExtension>()

abstract class KmpJvmExtension(project: Project) {
    val mainClass: Property<String> = project.objects.property(String::class.java)

    companion object {
        private const val NAME = "kmpJvm"

        fun Project.registerKotlinMultiplatformExtension(): KmpJvmExtension {
            return extensions.create(NAME, KmpJvmExtension::class.java)
        }
    }
}
