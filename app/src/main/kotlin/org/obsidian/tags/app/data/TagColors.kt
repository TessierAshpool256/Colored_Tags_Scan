package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class TagColors(
    @SerialName("ColorPicker")
    var colorPicker: ArrayList<ColorPicker> = arrayListOf(),
    @SerialName("EnableMultipleTags")
    var enableMultipleTags: Boolean? = null,
    @SerialName("EnableSeparateBackground")
    var enableSeparateBackground: Boolean? = null,
    @SerialName("EnableBackgroundOpacity")
    var enableBackgroundOpacity: Boolean? = null,
    @SerialName("Values")
    var values: Values? = Values()
)
