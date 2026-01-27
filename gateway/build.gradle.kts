plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(project(":common"))
    compileOnly("com.inductiveautomation.ignitionsdk:ignition-common:8.1.0")
    compileOnly("com.inductiveautomation.ignitionsdk:gateway-api:8.1.0")
    compileOnly("com.inductiveautomation.ignitionsdk:perspective-gateway:8.1.0")
    compileOnly(group = "com.inductiveautomation.ignition", name = "ia-gson", version = "2.8.5")
}
