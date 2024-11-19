package org.freekode.tp2intervals.domain.workout

import java.time.LocalDate
import org.freekode.tp2intervals.domain.ExternalData
import org.freekode.tp2intervals.domain.Platform
import org.freekode.tp2intervals.domain.librarycontainer.LibraryContainer

interface WorkoutRepository {
    fun platform(): Platform

    fun getWorkoutsFromCalendar(startDate: LocalDate, endDate: LocalDate): List<Workout>

    fun getWorkoutsFromLibrary(libraryContainer: LibraryContainer): List<Workout>

    fun getWorkoutFromLibrary(externalData: ExternalData): Workout

    fun findWorkoutsFromLibraryByName(name: String): List<WorkoutDetails>

    fun saveWorkoutsToCalendar(workouts: List<Workout>)

    fun saveWorkoutsToLibrary(libraryContainer: LibraryContainer, workouts: List<Workout>)

    fun deleteWorkoutsFromCalendar(startDate: LocalDate, endDate: LocalDate)
}
