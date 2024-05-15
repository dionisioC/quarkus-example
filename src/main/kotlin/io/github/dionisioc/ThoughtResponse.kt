package io.github.dionisioc

import kotlinx.serialization.Serializable

@Serializable
data class ThoughtResponse(
    val id: String,
    val content: String,
    val kind: Kind
)