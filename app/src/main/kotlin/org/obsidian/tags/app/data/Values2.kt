package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Values2(
    @SerialName("BackgroundOpacity")
    var backgroundOpacity: Double? = null,
    @SerialName("ForceImportant")
    var forceImportant: Boolean? = null,
    @SerialName("BorderRadius")
    var borderRadius: String? = null,
    @SerialName("Padding")
    var padding: String? = null
)
