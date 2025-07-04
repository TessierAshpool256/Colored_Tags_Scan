package org.obsidian.tags.app.utile


/**
 * Man - info about parameter
 */
fun man() {
    println(
        """
        --help 
            Print this massage
                
        --debug
            Print debug messages
        
        --allState
            Search not only for tags, but also by all properties
            (COMING SONE (no))
        
        --dir <path>
            Work dir
        
        --depth <depth>
            Number of folder nesting levels checked during processing
        """.trimIndent()
    )
}
