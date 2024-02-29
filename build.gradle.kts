plugins {
  java
  id("org.graalvm.buildtools.native") version "0.10.1"
}

group = "com.github.mizosoft.pg"
version = "1.0-SNAPSHOT"

java {
  toolchain {
    languageVersion = JavaLanguageVersion.of(21)
    vendor = JvmVendorSpec.GRAAL_VM
  }
}

graalvmNative {
  toolchainDetection = true
}

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(platform("org.junit:junit-bom:5.9.1"))
  testImplementation("org.junit.jupiter:junit-jupiter")
  testImplementation("org.mockito:mockito-core:5.10.0")
}

tasks.test {
  useJUnitPlatform()
}