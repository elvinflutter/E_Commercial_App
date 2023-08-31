buildscript {
    dependencies {
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.44")
        classpath ("com.google.gms:google-services:4.3.15")

        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.1")
    }
}
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id ("androidx.navigation.safeargs.kotlin") version "2.5.1" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
}

//task clean(type: Delete) {
//    delete rootProject.buildDir
//}