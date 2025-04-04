package io.github.vinicreis.convention.config.kotlin.multiplatform.jvm

import org.gradle.api.Project
import org.gradle.jvm.tasks.Jar
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

private val Project.artifactName: String
    get() = path.replaceFirst(":", "").replace(":", "-")

@OptIn(ExperimentalKotlinGradlePluginApi::class)
internal fun Project.configureJvm() {
    afterEvaluate {
        tasks.withType<Jar> {
            archiveBaseName.set(artifactName)
        }
    }
}
