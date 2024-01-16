package org.freekode.tp2intervals.domain.activity

import org.freekode.tp2intervals.app.Platform
import java.time.LocalDate

interface ActivityRepository {
    fun platform(): Platform

    fun getActivities(startDate: LocalDate, endDate: LocalDate): List<Activity>

    fun createActivity(activity: Activity)
}
