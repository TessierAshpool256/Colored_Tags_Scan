package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class FolderNote(
    @SerialName("Enable")
    var enable: Boolean? = null,
    @SerialName("FolderTagLinks")
    var folderTagLinks: ArrayList<FolderTagLinks> = arrayListOf(),
    @SerialName("EnableAutoDetect")
    var enableAutoDetect: Boolean? = null,
    @SerialName("EnableBackgroundOpacity")
    var enableBackgroundOpacity: Boolean? = null,
    @SerialName("Values")
    var values: Values? = Values()
)
