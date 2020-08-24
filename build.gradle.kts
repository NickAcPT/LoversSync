import kr.entree.spigradle.kotlin.*

plugins {
    java
    id("kr.entree.spigradle") version "2.1.2"
    id("kr.entree.spigradle.bungee") version "2.1.2"
}

group = "io.github.nickacpt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    spigotmc()
    bungeecord()
}

dependencies {
    compileOnly(spigot("1.16.1"))
    compileOnly(bungeecord("1.15"))
}