package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Color(
    @SerialName("r") var r: Int? = null,
    @SerialName("g") var g: Int? = null,
    @SerialName("b") var b: Int? = null
)
