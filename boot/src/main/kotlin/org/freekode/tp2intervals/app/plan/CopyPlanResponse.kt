package org.freekode.tp2intervals.app.plan

import org.freekode.tp2intervals.domain.ExternalData

data class CopyPlanResponse(
    val planName: String,
    val workouts: Int,
    val externalData: ExternalData,
)
