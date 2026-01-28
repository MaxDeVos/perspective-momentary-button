plugins {
    `java-library`
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "ignition-common",
        version = "8.3.0")

    compileOnly(
        group = "com.inductiveautomation.ignitionsdk",
        name = "perspective-common",
        version = "8.3.0")

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
