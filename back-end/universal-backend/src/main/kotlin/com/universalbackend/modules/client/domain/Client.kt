package com.universalbackend.modules.client.domain

import jakarta.persistence.*

@Entity
data class Client(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val name: String,
    val email: String
)
