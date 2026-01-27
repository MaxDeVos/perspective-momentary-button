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
        name = "designer-api",
        version = "8.1.0")

    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "perspective-designer",
        version = "8.1.0")

    compileOnly(
        group = "com.google.code.findbugs",
        name = "jsr305",
        version = "3.0.1"
    )
}
