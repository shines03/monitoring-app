package com.example.monitor.scheduler

import io.micrometer.core.instrument.MeterRegistry
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class MetricPublisher(
    private val meterRegistry: MeterRegistry
) {

    @Scheduled(initialDelay = 3000, fixedDelay = 3000)
    fun publishMetric() {
        meterRegistry.counter("Test_Metrics").increment()
    }
}