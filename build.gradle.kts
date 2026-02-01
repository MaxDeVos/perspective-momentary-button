import io.ia.sdk.gradle.modl.model.IgnitionScope

plugins {
    id("org.imdc.conventions.base")
    alias(libs.plugins.modl)
}

version = "1.0.3"

ignitionModule {
    // name of the .modl file to build
    fileName.set("PerspectiveMomentaryButton-module")

    // module xml configuration
    name.set("Perspective Momentary Button")
    id.set("org.imdc.perspective.momentarybutton")
    moduleVersion.set("${project.version}")
    moduleDescription.set("A momentary button component for Perspective")
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
    projectScopes = mapOf(
        ":gateway" to IgnitionScope.GATEWAY.code,
        ":designer" to IgnitionScope.DESIGNER.code,
        ":common" to IgnitionScope.GATEWAY_DESIGNER.code
    )

    hooks = mapOf(
        "org.imdc.perspective.momentarybutton.gateway.GatewayHook" to IgnitionScope.GATEWAY.code,
        "org.imdc.perspective.momentarybutton.designer.DesignerHook" to IgnitionScope.DESIGNER.code,
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
