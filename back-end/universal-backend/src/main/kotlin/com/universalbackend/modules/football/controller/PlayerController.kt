package com.universalbackend.modules.football.controller

import com.universalbackend.core.AbstractCRUDController
import com.universalbackend.modules.football.domain.Player
import com.universalbackend.modules.football.service.PlayerService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/players")
@Tag(name = "Jogadores", description = "Operações relacionadas a jogadores")
class PlayerController(
    service: PlayerService
) : AbstractCRUDController<Player, Long>(service)
