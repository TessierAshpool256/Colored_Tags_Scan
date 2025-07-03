package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Kanban(
    @SerialName("Enable") var enable: Boolean? = null,
    @SerialName("EnableCards") var enableCards: Boolean? = null,
    @SerialName("EnableLists") var enableLists: Boolean? = null,
    @SerialName("HideHashtags") var hideHashtags: Boolean? = null,
    @SerialName("EnableBackgroundOpacity") var enableBackgroundOpacity: Boolean? = null,
    @SerialName("Values") var values: Values = Values()
)
