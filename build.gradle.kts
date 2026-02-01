import java.util.concurrent.TimeUnit

plugins {
    base
    id("io.ia.sdk.modl") version("0.5.0")
}

subprojects {
    // cascade version, which will be set at command line in CI, down to subprojects
    version = "1.0.3"
    group = "org.imdc"
}

allprojects {
    // check for new versions of dependencies more frequently than default 24 hours.
    configurations.configureEach({
        resolutionStrategy {
            cacheChangingModulesFor(30, TimeUnit.SECONDS)
        }
    })
}

ignitionModule {
    // name of the .modl file to build
    fileName.set("PerspectiveMomentaryButton")

    // module xml configuration
    name.set("Perspective Momentary Button")
    id.set("org.imdc.perspective.momentarybutton")
    moduleVersion.set("${project.version}")
    moduleDescription.set("The module provides a Perspective momentary button component")
    requiredIgnitionVersion.set("8.3.0")
    requiredFrameworkVersion.set("8")
    freeModule.set(true)
    license.set("license.html")

    moduleDependencySpecs {
        register("com.inductiveautomation.perspective"){
            scope = "GD"
            required = true
        }
    }

    // map our projects to the scopes their jars should apply.  Web isn't here because its assets are moved
    // into the gateway resource folder as part of the module's build
    projectScopes.putAll(
        mapOf(
            ":gateway" to "G",
            ":designer" to "D",
            ":common" to "GD"
        )
    )

    hooks.putAll(
        mapOf(
            "org.imdc.perspective.momentarybutton.gateway.GatewayHook" to "G",
            "org.imdc.perspective.momentarybutton.designer.DesignerHook" to "D"
        )
    )

    skipModlSigning.set(true)
}

val deepClean by tasks.registering {
    dependsOn(allprojects.map { "${it.path}:clean" })
    description = "Executes clean tasks and remove node plugin caches."
    doLast {
        delete(file(".gradle"))
    }
}
