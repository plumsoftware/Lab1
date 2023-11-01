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
//    versionCatalogs {
//        create("libs"){
//            from(files("libs.versions.toml"))
//        }
//    }
//    Ошибки при включении versionCatalogs
}

rootProject.name = "Lab1"
include(":app")
