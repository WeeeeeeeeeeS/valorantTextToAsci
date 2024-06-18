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

}

application.mainClass.set("wee.dev.Main")
