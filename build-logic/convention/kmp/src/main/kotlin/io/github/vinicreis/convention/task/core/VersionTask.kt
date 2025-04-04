package io.github.vinicreis.convention.task.core

import io.github.vinicreis.convention.extension.libs
import io.github.vinicreis.convention.model.Version
import org.gradle.api.Project
import kotlin.jvm.optionals.getOrNull

internal fun Project.configureVersionTask() {
    tasks.register("appVersion") {
        group = "distribution"
        description = "Prints the app version on Console for deploy reasons"

        doLast {
            libs.findVersion(Version.Alias.APP).getOrNull()?.also {
                print(it)
            } ?: println("Set App version on Version Catalog with the alias \"app\"")
        }
    }
}
