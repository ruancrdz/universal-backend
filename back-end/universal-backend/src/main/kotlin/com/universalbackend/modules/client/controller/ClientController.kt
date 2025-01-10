package com.universalbackend.modules.client.controller

import com.universalbackend.core.AbstractCRUDController
import com.universalbackend.modules.client.domain.Client
import com.universalbackend.modules.client.service.ClientService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clients")
@Tag(name = "Clients", description = "Operações relacionadas aos testes")
class ClientController(
    service: ClientService
) : AbstractCRUDController<Client, Long>(service)
