package com.strmchsr.fileuploaderlib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform