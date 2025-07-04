package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ColorPicker(
    @SerialName("tag_name")
    var tagName: String = "",
    @SerialName("color")
    var color: Color? = Color(),
    @SerialName("background_color")
    var backgroundColor: BackgroundColor? = BackgroundColor(),
    @SerialName("luminance_offset")
    var luminanceOffset: Double? = null
)
