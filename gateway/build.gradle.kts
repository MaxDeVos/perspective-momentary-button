plugins {
    `java-library`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(project(":common"))

    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "gateway-api",
        version = "8.1.0")

    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "perspective-gateway",
        version = "8.1.0")
}
