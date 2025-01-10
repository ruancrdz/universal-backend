package com.universalbackend.modules.football.repository

import com.universalbackend.core.AbstractCRUDRepository
import com.universalbackend.modules.football.domain.Team
import org.springframework.stereotype.Repository

@Repository
interface TeamRepository : AbstractCRUDRepository<Team, Long>
