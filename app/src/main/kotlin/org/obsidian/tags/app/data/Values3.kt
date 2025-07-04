package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Values3(
    @SerialName("BackgroundOpacity")
    var backgroundOpacity: Double? = null,
    @SerialName("CardBackgroundOpacity")
    var cardBackgroundOpacity: Double? = null,
    @SerialName("CardBorderOpacity")
    var cardBorderOpacity: Double? = null,
    @SerialName("ListBackgroundOpacity")
    var listBackgroundOpacity: Double? = null,
    @SerialName("ListBorderOpacity")
    var listBorderOpacity: Double? = null
)
