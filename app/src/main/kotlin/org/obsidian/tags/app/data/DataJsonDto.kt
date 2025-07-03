package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class DataJsonDto(
    @SerialName("TagColors")
    var tagColors: TagColors = TagColors(),
    @SerialName("CSS")
    var cSS: CSS = CSS(),
    @SerialName("FolderNote")
    var folderNote: FolderNote = FolderNote(),
    @SerialName("Kanban")
    var kanban: Kanban = Kanban(),
    @SerialName("Canvas")
    var canvas: Canvas = Canvas(),
    @SerialName("Debug")
    var debug: Debug = Debug(),
    @SerialName("Info")
    var info: Info = Info()
)
