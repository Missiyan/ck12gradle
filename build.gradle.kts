plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.9.0")
    testImplementation ("org.testng:testng:7.5")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
    useTestNG()
}