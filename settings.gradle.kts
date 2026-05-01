pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "UIT20Years"

include(":app")

// Core modules
include(":core:core-common")
include(":core:core-model")
include(":core:core-domain")
include(":core:core-data")
include(":core:core-firebase")
include(":core:core-search")
include(":core:core-media")
include(":core:core-ui")

// Feature modules
include(":feature:feature-auth")
include(":feature:feature-moments")
include(":feature:feature-events")
include(":feature:feature-heritage")
include(":feature:feature-profile")
include(":feature:feature-notifications")
