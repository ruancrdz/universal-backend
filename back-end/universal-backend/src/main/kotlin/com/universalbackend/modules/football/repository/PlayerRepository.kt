package com.universalbackend.modules.football.repository

import com.universalbackend.core.AbstractCRUDRepository
import com.universalbackend.modules.football.domain.Player
import org.springframework.stereotype.Repository

@Repository
interface PlayerRepository : AbstractCRUDRepository<Player, Long>
