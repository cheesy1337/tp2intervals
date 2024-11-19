package org.freekode.tp2intervals.domain.librarycontainer

import java.io.Serializable
import java.time.LocalDate
import org.freekode.tp2intervals.domain.ExternalData
import org.freekode.tp2intervals.infrastructure.utils.Date

data class LibraryContainer(
    val name: String,
    val startDate: LocalDate,
    val isPlan: Boolean,
    val workoutsAmount: Int,
    val externalData: ExternalData,
) : Serializable {
    companion object {
        fun planFromMonday(name: String, workoutsAmount: Int, externalData: ExternalData): LibraryContainer {
            return LibraryContainer(name, Date.thisMonday(), true, workoutsAmount, externalData)
        }
    }
}
