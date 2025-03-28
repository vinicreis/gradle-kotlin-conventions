package io.github.vinicreis.convention.plugin.kotlin.multiplatform.compose

import io.github.vinicreis.convention.config.kotlin.multiplatform.compose.addCoreComposeDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.compose.addMaterialIconsComposeDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.compose.addNavigationComposeDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.compose.addPreviewComposeDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.compose.addResourcesComposeDependencies
import io.github.vinicreis.convention.config.kotlin.multiplatform.compose.addShimmerComposeDependencies
import org.gradle.api.Project

@Suppress("unused")
abstract class KmpComposeExtension(private val project: Project) {
    init {
        core()
    }

    internal fun core() {
        project.addCoreComposeDependencies()
    }

    fun navigation() {
        project.addNavigationComposeDependencies()
    }

    fun resources() {
        project.addResourcesComposeDependencies()
    }

    fun preview() {
        project.addPreviewComposeDependencies()
    }

    fun materialIconsExtended() {
        project.addMaterialIconsComposeDependencies()
    }

    fun shimmer() {
        project.addShimmerComposeDependencies()
    }

    companion object {
        private const val NAME = "kmpCompose"

        fun Project.registerKpmComposeExtension() {
            extensions.create(NAME, KmpComposeExtension::class.java)
        }
    }
}
