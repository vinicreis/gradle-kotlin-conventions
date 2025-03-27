plugins {
    `kotlin-dsl`
}

dependencies {
    compileOnly(libs.kotlin.multiplatform.plugin)
    compileOnly(libs.google.ksp.plugin)
}

gradlePlugin {
    plugins {
        register("io.github.vinicreis.convention.kotlin.multiplatform") {
            id = "io.github.vinicreis.convention.kotlin.multiplatform"
            implementationClass = "io.github.vinicreis.convention.plugin.kotlin.multiplatform.KotlinMultiplatformLibraryPlugin"
        }

        register("io.github.vinicreis.convention.kotlin.multiplatform.jvm") {
            id = "io.github.vinicreis.convention.kotlin.multiplatform.jvm"
            implementationClass = "io.github.vinicreis.convention.plugin.kotlin.jvm.JvmMultiplatformLibraryPlugin"
        }
    }
}
