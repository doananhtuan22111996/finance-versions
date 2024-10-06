import org.gradle.api.JavaVersion

object Configs {
    const val namespace = "vn.finance.versions"
    const val minSdk = 24
    const val targetSdk = 34
    const val compileSdk = 34
    const val jvmTarget = "17"
    const val kotlinCompilerExtensionVersion = "1.5.14"
    val javaVersion = JavaVersion.VERSION_17

    object Versions {
        const val mavenDomain = "https://maven.pkg.github.com"
        const val VERSION_TOML = "finance.versions.toml"
        const val GITHUB_PACKAGES = "GitHubPackages"
        const val GROUP_ID = "vn.finance.libs"
        const val ARTIFACT_ID = "versions"
        const val VERSION = "1.0.0"
    }
}


