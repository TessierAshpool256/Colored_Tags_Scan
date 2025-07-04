package org.obsidian.tags.app.utile

import java.io.File

const val DEFAULT_DEEP = 10


object Settings {
    /**
     * Debugging, print debug messages
     */
    var debug: Boolean = false

    /**
     * Number of folder nesting levels checked during processing
     */
    var depth: Int = DEFAULT_DEEP

    /**
     * Search not only for tags, but also by all properties
     */
    var all_state: Boolean = false

    /**
     * Work dir
     */
    var dir = File(".")

    fun checkArgs(args: Array<String>) {
        args.forEachIndexed { i, arg ->
            when (arg) {
                "--debug" -> debug = true
                "--depth" -> {
                    if (args.size > i + 1) {
                        try {
                            depth = args[i + 1].toInt()
                        } catch (_: NumberFormatException) {
                            println("Invalid depth number")
                        }
                    }
                }
                "--allState" -> { all_state = true }
                "--dir" -> {
                    if (args.size > i + 1 && File(args[i + 1]).exists())
                        dir = File(args[i + 1])
                    else
                        println("Dir parameter - missing directory")
                }
            }
        }
    }

    /**
     * Debug - Execute the expression if the debug mode is enabled
     */
    fun debug(execute: () -> Unit) {
        if (debug)
            execute()
    }
}
