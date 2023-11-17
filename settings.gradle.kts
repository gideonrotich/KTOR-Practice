pluginManagement {
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

rootProject.name = "KTOR Practice"
include(":app")
include(":data")
include(":datasource")
include(":domain")
include(":presentation")
include(":datasource:local")
include(":datasource:remote")
