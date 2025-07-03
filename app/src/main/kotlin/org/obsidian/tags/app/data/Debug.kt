package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Debug(
    @SerialName("Enable")
    var enable: Boolean? = null,
    @SerialName("EnableExperimentalCommands")
    var enableExperimentalCommands: Boolean? = null
)
