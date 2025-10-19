rootProject.name = "ladder-common"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven {
            name = "MavenPublic"
            url = uri("https://repo.lylaw.fr/repository/maven-public/")
        }
    }
}