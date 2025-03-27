plugins {
    alias(libs.plugins.convention.jvm)
}

multiplatformJvm {
    mainClass.set("some")
}
