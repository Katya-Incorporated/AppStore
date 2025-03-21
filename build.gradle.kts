plugins {
    id("com.android.application") version "8.9.0" apply false
    id("org.jetbrains.kotlin.android") version "2.1.20" apply false
    id("androidx.navigation.safeargs") version "2.8.9" apply false
    id("com.google.devtools.ksp") version "2.1.20-1.0.31" apply false
}

allprojects {
    tasks.withType<JavaCompile> {
        options.compilerArgs.addAll(listOf("-Xlint", "-Xlint:-classfile", "-Xlint:-rawtypes", "-Xlint:-serial"))
    }
}
