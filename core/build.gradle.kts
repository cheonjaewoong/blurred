plugins {
    id("org.jetbrains.kotlin.android")
    id("com.android.library")
    id("app.cash.paparazzi")
}

android {
    namespace = "io.woong.blurred.core"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33

        externalNativeBuild {
            cmake {
                cppFlags("-std=c++17")
            }
        }
    }

    externalNativeBuild {
        cmake {
            path("./CMakeLists.txt")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    testImplementation("junit:junit:4.13.2")
}
