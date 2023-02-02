import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.android") version "1.7.20" apply false
    id("com.android.library") version "7.4.0" apply false
    id("app.cash.paparazzi") version "1.2.0" apply false
}

allprojects {
    group = "io.woong.blurred"
    version = "0.1.0"

    repositories {
        google()
        mavenCentral()
    }
}

subprojects {
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
        kotlinOptions.freeCompilerArgs += "-Xexplicit-api=strict"
    }

    tasks.withType<Test> {
        useJUnit()
    }
}
