package com.universalbackend.modules.football.domain

import jakarta.persistence.*

@Entity
data class Player(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,
    val position: String,

    @ManyToOne
    @JoinColumn(name = "team_id")
    val team: Team? = null
)
