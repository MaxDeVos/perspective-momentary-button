package org.imdc.conventions

import com.diffplug.gradle.spotless.SpotlessExtension
import libs

plugins {
    id("org.imdc.conventions.modl-component")
    `java-library`
    idea
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(libs.versions.java.get()))
    }
}

configure<SpotlessExtension> {
    java {
        palantirJavaFormat()
        formatAnnotations()
    }
    kotlin {
        ktlint()
    }
    kotlinGradle {
        ktlint()
    }
}

// Explicitly instruct IDEA *not* to download sources as workaround for a bug/flaw in IDEA's javadoc integration.
// It seems that if IDEA cannot resolve the sources JAR for a given dependency, it won't bother trying to resolve the javadocs either.
// This behavior is troublesome with respect to IA packages, which never contain sources, but often contain javadocs.
// Unfortunately, this also means no source resolution for source-available non-IA packages like Jetty, but it doesn't
// truly matter since IA excludes third-party sources and javadocs from their Nexus repositories, which we are using
// exclusively for non-plugin dependency resolution. I do not know why they do this, but there is probably a good reason.
idea.module {
    isDownloadJavadoc = true
    isDownloadSources = false
}
