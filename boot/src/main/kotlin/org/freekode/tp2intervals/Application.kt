package org.freekode.tp2intervals

import org.freekode.tp2intervals.app.confguration.DefaultConfigurationProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
@EnableCaching
@EnableConfigurationProperties(
    DefaultConfigurationProperties::class
)
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
