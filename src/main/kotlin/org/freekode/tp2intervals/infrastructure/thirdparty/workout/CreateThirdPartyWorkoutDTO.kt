package org.freekode.tp2intervals.infrastructure.thirdparty.workout

import java.time.LocalDate

class CreateThirdPartyWorkoutDTO(
    var athleteId: String,
    var workoutDay: LocalDate,
    var workoutTypeValueId: Int,
    var title: String,
    var totalTime: Double?,
    var totalTimePlanned: Double?,
    var tssActual: Double?,
    var tssPlanned: Double?,
    var structure: String?
) {
    companion object {
        fun planWorkout(
            athleteId: String, workoutDay: LocalDate, workoutTypeValueId: Int, title: String,
            totalTimePlanned: Double?, tssPlanned: Double?, structure: String?
        ): CreateThirdPartyWorkoutDTO {
            return CreateThirdPartyWorkoutDTO(
                athleteId,
                workoutDay,
                workoutTypeValueId,
                title,
                null,
                totalTimePlanned,
                null,
                tssPlanned,
                structure
            )
        }

        fun createWorkout(
            athleteId: String, workoutDay: LocalDate, workoutTypeValueId: Int, title: String,
            totalTime: Double?, tssActual: Double?
        ): CreateThirdPartyWorkoutDTO {
            return CreateThirdPartyWorkoutDTO(
                athleteId,
                workoutDay,
                workoutTypeValueId,
                title,
                totalTime,
                null,
                tssActual,
                null,
                null
            )
        }
    }
}
