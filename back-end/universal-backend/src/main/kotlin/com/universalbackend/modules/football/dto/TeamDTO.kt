package com.universalbackend.modules.football.dto

data class TeamDTO(
    val id: Long,
    val name: String,
    val players: List<PlayerDTO>
)
