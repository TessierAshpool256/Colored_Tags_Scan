package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Canvas(
    @SerialName("Enable")
    var enable: Boolean = true,
    @SerialName("EnableBackgroundOpacity")
    var enableBackgroundOpacity: Boolean? = null,
    @SerialName("Values")
    var values: Values4? = Values4()
)
