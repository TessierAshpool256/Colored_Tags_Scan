package org.obsidian.tags.app.utile

import org.obsidian.tags.app.DataManager
import org.obsidian.tags.app.data.FolderTagLinks
import java.io.File


fun classificationFile(file: File) {
    val text = file.readText()

    val metadata = text.substringAfter("---").substringBefore("---")


    DataManager.tags.forEach { tag ->
        val matches = tag.regex.find(metadata)

        if (matches != null) {
            DataManager.paths.add(FolderTagLinks(tag.name, cutLocalPath(file)))
        }
    }

    Settings.all_state
}
