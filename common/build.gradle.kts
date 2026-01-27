plugins {
    `java-library`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly("com.inductiveautomation.ignitionsdk:ignition-common:8.1.0")
    compileOnly("com.inductiveautomation.ignitionsdk:perspective-common:8.1.0")
    compileOnly(group = "com.google.guava", name = "guava", version = "23.3-jre")
    compileOnly(group = "com.inductiveautomation.ignition", name = "ia-gson", version = "2.8.5")
}
