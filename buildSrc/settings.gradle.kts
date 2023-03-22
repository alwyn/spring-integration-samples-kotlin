rootProject.name = "buildSrc"


// workaround for version catalog in buildSrc. See https://github.com/gradle/gradle/issues/15383
dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}
