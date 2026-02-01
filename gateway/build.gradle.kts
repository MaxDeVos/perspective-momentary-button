plugins {
    id("org.imdc.conventions.modl-jvm-component")
}

dependencies {
    compileOnly(project(":common"))

    compileOnly(libs.bundles.common)
    compileOnly(libs.bundles.gateway)
}
