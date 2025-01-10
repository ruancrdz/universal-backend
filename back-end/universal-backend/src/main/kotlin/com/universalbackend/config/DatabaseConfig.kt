package com.universalbackend.config

import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class DatabaseConfig {

    @Value("\${spring.datasource.url}")
    private lateinit var databaseUrl: String

    @PostConstruct
    fun logDatabaseConfig() {
        println("Conectando ao banco de dados: $databaseUrl")
    }
}
