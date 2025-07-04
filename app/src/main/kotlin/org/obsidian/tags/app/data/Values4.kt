package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Values4(
    @SerialName("BackgroundOpacity")
    var backgroundOpacity: Double? = null,
    @SerialName("CardBorderOpacity")
    var cardBorderOpacity: Double? = null,
    @SerialName("CardBackgroundLuminanceOffset")
    var cardBackgroundLuminanceOffset: Double? = null
)
