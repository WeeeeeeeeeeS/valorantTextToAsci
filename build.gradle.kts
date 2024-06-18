plugins {
    id("java")
    id("application")
}

group = "wee.dev"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.gson:gson:2.11.0")
}

application.mainClass.set("wee.dev.Main")
