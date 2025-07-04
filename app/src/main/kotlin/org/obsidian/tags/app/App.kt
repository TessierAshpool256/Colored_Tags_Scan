package org.obsidian.tags.app

import org.obsidian.tags.app.utile.Settings
import org.obsidian.tags.app.utile.classificationFile
import org.obsidian.tags.app.utile.man
import org.obsidian.tags.app.utile.recursiveDirectoryWalk


fun main(args: Array<String>) {
    // Check "help"
    args.forEach { arg ->
        if (arg == "--help") {
            man()
            return
        }
    }

    Settings.checkArgs(args)

    // Read data "data.json"
    DataManager.readData()

    recursiveDirectoryWalk(Settings.dir, Settings.depth) { file ->
//        Settings.debug { println("File: ${file.absolutePath}") }

        classificationFile(file)
    }

    DataManager.paths.forEach { println(it) }

    DataManager.write()
}
