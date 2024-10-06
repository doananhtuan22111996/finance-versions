import Configs.Versions.GITHUB_PACKAGES
import vn.finance.buildSrc.password
import vn.finance.buildSrc.repository
import vn.finance.buildSrc.username

plugins {
    `java-library`
    alias(mobilex.plugins.jetbrainsKotlinJvm)
    `maven-publish`
    `version-catalog`
}

java {
    sourceCompatibility = Configs.javaVersion
    targetCompatibility = Configs.javaVersion
}

publishing {
    repositories {
        maven {
            name = GITHUB_PACKAGES
            url = repository()
            credentials {
                username = username()
                password = password()
            }
        }
    }
    publications {
        create<MavenPublication>("catalog") {
            from(components["versionCatalog"])
            groupId = Configs.Versions.GROUP_ID // Replace with your GitHub username
            artifactId = Configs.Versions.ARTIFACT_ID
            version = Configs.Versions.VERSION // Set your desired version here
        }
    }
}

versionCatalogs {
    catalog {
        versionCatalog {
            from(files(Configs.Versions.VERSION_TOML))
        }
    }
}