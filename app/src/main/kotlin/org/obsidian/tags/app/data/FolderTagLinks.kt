package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class FolderTagLinks(
    @SerialName("tag_name")
    var tagName: String? = null,
    @SerialName("folder_path")
    var folderPath: String? = null
)
