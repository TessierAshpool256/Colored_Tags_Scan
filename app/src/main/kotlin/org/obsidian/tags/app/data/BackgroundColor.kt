package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class BackgroundColor(
    @SerialName("r") var r: Int = 0,
    @SerialName("g") var g: Int = 0,
    @SerialName("b") var b: Int = 0
)
