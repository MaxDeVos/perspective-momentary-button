package org.imdc.conventions

import com.diffplug.gradle.spotless.SpotlessExtension

plugins {
    id("org.imdc.conventions.modl-component")
}

// TODO - Integrate Spotless's ESLint to unify linting project-wide and simplify npm/yarn/webpack stuff
//configure<SpotlessExtension> {
//    typescript {
//        target("**/*.ts", "**/*.tsx")
//        eslint()
//    }
//    javascript {
//        target("**/*.js", "**/*.jsx")
//        eslint()
//    }
//    json {
//        target("**/*.json")
//        simple()
//    }
//}
