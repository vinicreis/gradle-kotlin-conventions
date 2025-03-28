plugins {
    `kotlin-dsl`
    alias(libs.plugins.gradle.plugin.publish)
}

version = libs.versions.app.get()

dependencies {
    compileOnly(libs.kotlin.multiplatform.plugin)
    compileOnly(libs.kotlin.compose.plugin)
    compileOnly(libs.compose.plugin)
    compileOnly(libs.google.ksp.plugin)
}

gradlePlugin {
    website.set("https://github.com/vinicreis/gradle-kotlin-conventions")
    vcsUrl.set("https://github.com/vinicreis/gradle-kotlin-conventions")

    plugins {
        register("io.github.vinicreis.convention.kmp.core") {
            id = "io.github.vinicreis.convention.kmp.core"
            displayName = "Kotlin Multiplatform Project conventions plugin"
            description = "Conventions to add KMP support for Gradle projects"
            tags = listOf("convention", "kotlin", "kmp")
            implementationClass = "io.github.vinicreis.convention.plugin.kotlin.multiplatform.core.KmpCoreLibraryPlugin"
        }

        register("io.github.vinicreis.convention.kmp.jvm") {
            id = "io.github.vinicreis.convention.kmp.jvm"
            displayName = "KMP JVM variant conventions plugin"
            description = "Conventions to configure and enable JVM variant to a KMP project"
            tags = listOf("convention", "kotlin", "kmp", "jvm")
            implementationClass = "io.github.vinicreis.convention.plugin.kotlin.multiplatform.jvm.KmpJvmLibraryPlugin"
        }

        register("io.github.vinicreis.convention.kmp.js") {
            id = "io.github.vinicreis.convention.kmp.js"
            displayName = "KMP JS variant conventions plugin"
            description = "Conventions to configure and enable JS variant to a KMP project"
            tags = listOf("convention", "kotlin", "kmp", "js")
            implementationClass = "io.github.vinicreis.convention.plugin.kotlin.multiplatform.js.KmpJsLibraryPlugin"
        }

        register("io.github.vinicreis.convention.kmp.compose") {
            id = "io.github.vinicreis.convention.kmp.compose"
            displayName = "KMP Compose conventions plugin"
            description = "Conventions to configure and enable Compose to a KMP project"
            tags = listOf("convention", "kotlin", "kmp", "compose")
            implementationClass = "io.github.vinicreis.convention.plugin.kotlin.multiplatform.compose.KmpComposeLibraryPlugin"
        }
    }
}

publishing {
    repositories {
        maven {
            val homePath = System.getProperty("user.home")

            name = "Local"
            url = uri("${homePath}/.plugins")
        }
    }
}
