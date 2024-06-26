rootProject.name = "otuskotlin-marketplace-202402"

pluginManagement {
    val kotlinVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

include("m1l1-first")
include("m1l2-basic")
include("m1l3-func")
include("m1l4-oop")
include("m1l5-dsl")
include("m2l1-coroutines")
include("m2l2-flows")
include("m2l3-kmp")
include("m2l4-1-interop")
include("m2l4-2-jni")