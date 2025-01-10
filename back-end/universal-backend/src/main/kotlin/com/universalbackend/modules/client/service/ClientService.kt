package com.universalbackend.modules.client.service

import com.universalbackend.core.AbstractCRUDService
import com.universalbackend.modules.client.domain.Client
import com.universalbackend.modules.client.repository.ClientRepository
import org.springframework.stereotype.Service

@Service
class ClientService(
    repository: ClientRepository
) : AbstractCRUDService<Client, Long>(repository)
