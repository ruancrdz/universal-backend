package com.universalbackend.modules.football.service

import com.universalbackend.core.AbstractCRUDService
import com.universalbackend.modules.football.domain.Team
import com.universalbackend.modules.football.repository.TeamRepository
import org.springframework.stereotype.Service

@Service
class TeamService(
    repository: TeamRepository
) : AbstractCRUDService<Team, Long>(repository)
