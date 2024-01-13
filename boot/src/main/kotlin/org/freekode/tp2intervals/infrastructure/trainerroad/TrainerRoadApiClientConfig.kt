package org.freekode.tp2intervals.infrastructure.trainerroad

import feign.RequestInterceptor
import feign.auth.BasicAuthRequestInterceptor
import org.freekode.tp2intervals.domain.config.AppConfigRepository
import org.springframework.context.annotation.Bean
import org.springframework.http.HttpHeaders
import java.util.*

class TrainerRoadApiClientConfig(
    private val appConfigRepository: AppConfigRepository
) {
    @Bean
    fun requestInterceptor(): RequestInterceptor {
        return RequestInterceptor { template ->
            val cookie = appConfigRepository.getConfig().tpConfig.authCookie
            template.header(HttpHeaders.COOKIE, "Basic $cookie")
        }
    }
}
