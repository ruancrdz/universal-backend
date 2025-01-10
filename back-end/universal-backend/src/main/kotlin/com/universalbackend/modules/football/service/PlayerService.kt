package com.universalbackend.modules.football.service

import com.universalbackend.core.AbstractCRUDService
import com.universalbackend.modules.football.domain.Player
import com.universalbackend.modules.football.repository.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerService(
    repository: PlayerRepository
) : AbstractCRUDService<Player, Long>(repository)
