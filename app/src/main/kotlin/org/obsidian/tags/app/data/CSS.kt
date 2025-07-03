package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CSS(
    @SerialName("NoteTags")
    var noteTags: Boolean? = null,
    @SerialName("NoteProperties")
    var noteProperties: Boolean? = null,
    @SerialName("NoteBackgrounds")
    var noteBackgrounds: Boolean? = null,
    @SerialName("TagsNoWrap")
    var tagsNoWrap: Boolean? = null,
    @SerialName("TagsNoWrapText")
    var tagsNoWrapText: String? = null
)
