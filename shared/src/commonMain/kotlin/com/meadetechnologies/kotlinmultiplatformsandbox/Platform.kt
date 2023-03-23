package com.meadetechnologies.kotlinmultiplatformsandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform