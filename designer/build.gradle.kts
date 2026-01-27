plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(project(":common"))
    compileOnly("com.google.code.findbugs:jsr305:3.0.1")
    compileOnly("com.inductiveautomation.ignitionsdk:designer-api:8.1.0")
    compileOnly("com.inductiveautomation.ignitionsdk:perspective-common:8.1.0")
    compileOnly("com.inductiveautomation.ignitionsdk:perspective-designer:8.1.0")
    compileOnly("com.inductiveautomation.ignitionsdk:ignition-common:8.1.0")
}
