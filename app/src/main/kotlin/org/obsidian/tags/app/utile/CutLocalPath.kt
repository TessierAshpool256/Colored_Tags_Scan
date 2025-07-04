package org.obsidian.tags.app.utile

import java.io.File


fun cutLocalPath(file: File) = file.path
    .substringAfter("${Settings.dir.path}/")
    .substringBeforeLast('/')
