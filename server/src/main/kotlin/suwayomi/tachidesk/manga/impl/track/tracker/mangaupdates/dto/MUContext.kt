package suwayomi.tachidesk.manga.impl.track.tracker.mangaupdates.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MUContext(
    @SerialName("session_token")
    val sessionToken: String,
    val uid: Long,
)
