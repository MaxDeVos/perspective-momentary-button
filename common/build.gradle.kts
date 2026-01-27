plugins {
    `java-library`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "ignition-common",
        version = "8.1.0")

    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "perspective-common",
        version = "8.1.0")

    compileOnly(
        group = "com.inductiveautomation.ignition",
        name = "ia-gson",
        version = "2.8.5"
    )

    compileOnly(
        group = "com.google.guava",
        name = "guava",
        version = "23.3-jre"
    )
}
