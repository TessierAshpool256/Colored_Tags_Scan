package org.obsidian.tags.app

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.obsidian.tags.app.data.DataJsonDto
import org.obsidian.tags.app.data.FolderTagLinks
import org.obsidian.tags.app.utile.Settings
import java.io.File

class Tags(val name: String) {
    val regex = Regex("s*- (?:\"#?$name\"|#?$name)")
}

/**
 * Manager work with data.json
 */
object DataManager {
    /**
     * Path to "data.json" от начала проекта
     */
    private const val PATH_TO_JSON = "/.obsidian/plugins/colored-tags-wrangler/data.json"

    /**
     * Object to "data.json"
     */
    var DataJsonDto: DataJsonDto? = null
    var tags: MutableList<Tags> = mutableListOf()
    val paths = mutableSetOf<FolderTagLinks>()
    var file = File(Settings.dir.path + PATH_TO_JSON)

    @OptIn(ExperimentalSerializationApi::class)
    val json = Json {
//        ignoreUnknownKeys = true
        prettyPrint = true
        prettyPrintIndent = "  "
    }

    /**
     * Read data "data.json" plugin "Colored Tag Wrangler"
     */
    fun readData() {
        file = File(Settings.dir.path + PATH_TO_JSON)
        if (file.isFile)
            DataJsonDto = json.decodeFromString<DataJsonDto>(file.readText(Charsets.UTF_8))
        else {
            Settings.debug {
                println("ERROR - data.json not found!")
            }
        }

        DataJsonDto?.folderNote?.folderTagLinks?.forEach { paths.add(it) }
        DataJsonDto?.tagColors?.colorPicker?.forEach { tags.add(Tags(it.tagName)) }
    }

    fun write() {
        DataJsonDto?.folderNote?.folderTagLinks = paths.toCollection(ArrayList())

        file.writeText(json.encodeToString(DataJsonDto))
    }
}
