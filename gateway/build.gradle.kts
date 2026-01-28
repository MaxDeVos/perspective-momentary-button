plugins {
    `java-library`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(project(":common"))

    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "gateway-api",
        version = "8.3.0")

    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "perspective-common",
        version = "8.3.0")

    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "perspective-gateway",
        version = "8.3.0")
}
