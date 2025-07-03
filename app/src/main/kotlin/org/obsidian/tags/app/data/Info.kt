package org.obsidian.tags.app.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Info(
    @SerialName("SettingsVersion")
    var settingsVersion: Int? = null
)
