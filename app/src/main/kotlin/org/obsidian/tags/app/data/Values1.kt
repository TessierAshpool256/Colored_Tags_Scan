package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Values1(
    @SerialName("BackgroundOpacity")
    var backgroundOpacity: Double? = null,
    @SerialName("LuminanceOffset")
    var luminanceOffset: Double? = null
)
