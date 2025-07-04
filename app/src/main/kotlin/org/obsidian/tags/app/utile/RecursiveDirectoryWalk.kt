package org.obsidian.tags.app.utile

import java.io.File


fun recursiveDirectoryWalk(dir: File, depth: Int, action: (File) -> Unit) {
    if (depth == 0)
        return

    if (!dir.isDirectory) {
        if (Settings.debug)
            println("${dir.absolutePath} is not directory")
        return
    }

    dir.listFiles()?.forEach { file ->
        when {
            file.isDirectory -> recursiveDirectoryWalk(file, depth - 1, action)
            file.isFile && file.extension == "md" -> action(file)
        }
    }
}
