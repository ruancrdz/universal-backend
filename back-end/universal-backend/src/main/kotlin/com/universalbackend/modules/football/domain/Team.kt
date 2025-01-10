package com.universalbackend.modules.football.domain

import jakarta.persistence.*

@Entity
data class Team(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,

    @OneToMany(mappedBy = "team", cascade = [CascadeType.ALL], orphanRemoval = true)
    val players: List<Player> = emptyList()
)
