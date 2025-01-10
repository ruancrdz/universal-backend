package com.universalbackend.modules.football.controller

import com.universalbackend.core.AbstractCRUDController
import com.universalbackend.modules.football.domain.Team
import com.universalbackend.modules.football.service.TeamService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/teams")
@Tag(name = "Times", description = "Operações relacionadas a times")
class TeamController(
    service: TeamService
) : AbstractCRUDController<Team, Long>(service)
